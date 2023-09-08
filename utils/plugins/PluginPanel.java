/*    */ package utils.plugins;
/*    */ 
/*    */ import java.awt.BorderLayout;
/*    */ import java.awt.Dimension;
/*    */ import java.awt.LayoutManager;
/*    */ import javax.swing.JPanel;
/*    */ import javax.swing.JScrollPane;
/*    */ import javax.swing.border.EmptyBorder;
/*    */ import ui.ColorScheme;
/*    */ import ui.DynamicGridLayout;
/*    */ 
/*    */ public abstract class PluginPanel
/*    */   extends JPanel
/*    */ {
/*    */   public static final int PANEL_WIDTH = 225;
/*    */   public static final int SCROLLBAR_WIDTH = 17;
/*    */   public static final int BORDER_OFFSET = 6;
/* 18 */   private static final EmptyBorder BORDER_PADDING = new EmptyBorder(6, 6, 6, 6);
/* 19 */   private static final Dimension OUTER_PREFERRED_SIZE = new Dimension(242, 0);
/*    */   private final JScrollPane scrollPane;
/*    */   private final JPanel wrappedPanel;
/*    */   
/*    */   public JScrollPane getScrollPane() {
/* 24 */     return this.scrollPane;
/*    */   }
/*    */   
/*    */   public JPanel getWrappedPanel() {
/* 28 */     return this.wrappedPanel;
/*    */   }
/*    */ 
/*    */ 
/*    */ 
/*    */   
/*    */   public PluginPanel() {
/* 35 */     this(true);
/*    */   }
/*    */ 
/*    */ 
/*    */   
/*    */   public PluginPanel(boolean wrap) {
/* 41 */     if (wrap) {
/*    */       
/* 43 */       setBorder(BORDER_PADDING);
/* 44 */       setLayout((LayoutManager)new DynamicGridLayout(0, 1, 0, 3));
/* 45 */       setBackground(ColorScheme.DARK_GRAY_COLOR);
/*    */       
/*    */       JPanel northPanel;
/* 48 */       (northPanel = new JPanel()).setLayout(new BorderLayout());
/* 49 */       northPanel.add(this, "North");
/* 50 */       northPanel.setBackground(ColorScheme.DARK_GRAY_COLOR);
/*    */       
/* 52 */       this.scrollPane = new JScrollPane(northPanel);
/* 53 */       this.scrollPane.setHorizontalScrollBarPolicy(31);
/*    */       
/* 55 */       this.wrappedPanel = new JPanel();
/*    */ 
/*    */ 
/*    */       
/* 59 */       this.wrappedPanel.setPreferredSize(OUTER_PREFERRED_SIZE);
/* 60 */       this.wrappedPanel.setLayout(new BorderLayout());
/* 61 */       this.wrappedPanel.add(this.scrollPane, "Center");
/*    */       
/*    */       return;
/*    */     } 
/* 65 */     this.scrollPane = null;
/* 66 */     this.wrappedPanel = this;
/*    */   }
/*    */ 
/*    */ 
/*    */ 
/*    */   
/*    */   public Dimension getPreferredSize() {
/* 73 */     int width = (this == this.wrappedPanel) ? 242 : 225;
/* 74 */     return new Dimension(width, (super.getPreferredSize()).height);
/*    */   }
/*    */   
/*    */   public void onActivate() {}
/*    */   
/*    */   public void onDeactivate() {}
/*    */ }


/* Location:              C:\Users\brett\OneDrive\Desktop\Zeah Decompiled .java\zeah-client.jar\\utils\plugins\PluginPanel.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */