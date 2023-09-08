/*     */ package utils.plugins.staff;
/*     */ 
/*     */ import java.awt.BorderLayout;
/*     */ import java.awt.GridLayout;
/*     */ import java.awt.event.ActionEvent;
/*     */ import java.awt.image.BufferedImage;
/*     */ import javax.swing.JComboBox;
/*     */ import javax.swing.JLabel;
/*     */ import javax.swing.JPanel;
/*     */ import javax.swing.border.EmptyBorder;
/*     */ import ui.ClientUI;
/*     */ import ui.ColorScheme;
/*     */ import utils.FontManager;
/*     */ import utils.Utils;
/*     */ import utils.plugins.PluginPanel;
/*     */ 
/*     */ public class AdminPanel extends PluginPanel {
/*     */   JPanel playerPanel;
/*     */   JPanel serverPanel;
/*  20 */   JPanel activePanel = null; JPanel devPanel; JPanel dangerPanel;
/*     */   private JPanel actionsPanel;
/*     */   private JComboBox panelsComboBox;
/*     */   
/*     */   public AdminPanel() {
/*  25 */     init();
/*     */   }
/*     */   
/*     */   public static void createPlugin(ClientUI ui) {
/*  29 */     BufferedImage iconOpen = Utils.loadImageResource(PluginPanel.class, "cmd.png");
/*     */     
/*  31 */     AdminPanel panel = new AdminPanel();
/*  32 */     ui.registerPlugin(iconOpen, panel, "Admin panel", 5, -1);
/*     */   }
/*     */   
/*     */   private static String htmlLabel(String key, String value) {
/*  36 */     return "<html><body style = 'color:#a5a5a5'>" + key + "<span style = 'color:white'>" + value + "</span></body></html>";
/*     */   }
/*     */   
/*     */   void createPlayerPanel() {
/*  40 */     this.playerPanel = new JPanel();
/*  41 */     this.playerPanel.setBackground(ColorScheme.DARKER_GRAY_COLOR);
/*  42 */     this.playerPanel.setBorder(new EmptyBorder(10, 10, 10, 10));
/*  43 */     this.playerPanel.setLayout(new BorderLayout(0, 10));
/*     */     
/*     */     JPanel btnPanel;
/*  46 */     (btnPanel = new JPanel()).setLayout(new GridLayout(0, 1));
/*     */     
/*     */     CmdButton btn;
/*  49 */     (btn = new CmdButton("Toggle godmode", "god")).setFont(FontManager.getRunescapeFont());
/*     */     CmdButton btn2;
/*  51 */     (btn2 = new CmdButton("Spawn melee gear", "meleegear")).setFont(FontManager.getRunescapeFont());
/*     */     CmdButton btn3;
/*  53 */     (btn3 = new CmdButton("Spawn ranged gear", "rangedgear")).setFont(FontManager.getRunescapeFont());
/*     */     CmdButton btn4;
/*  55 */     (btn4 = new CmdButton("Spawn magic gear", "magicgear")).setFont(FontManager.getRunescapeFont());
/*     */     CmdButton btn5;
/*  57 */     (btn5 = new CmdButton("Spawn food", "food")).setFont(FontManager.getRunescapeFont());
/*     */     CmdButton btn6;
/*  59 */     (btn6 = new CmdButton("Spawn runes", "runes")).setFont(FontManager.getRunescapeFont());
/*  60 */     CmdButton btn7 = new CmdButton("OSRS Appearance", "osrsappearance");
/*  61 */     btn6.setFont(FontManager.getRunescapeFont());
/*  62 */     CmdButton btn8 = new CmdButton("RSHD Apperance", "rshdappearance");
/*  63 */     btn6.setFont(FontManager.getRunescapeFont());
/*  64 */     CmdButton btn9 = new CmdButton("Increase max zoom", "zoom++");
/*  65 */     btn6.setFont(FontManager.getRunescapeFont());
/*  66 */     CmdButton btn10 = new CmdButton("Decrease max zoom", "zoom--");
/*  67 */     btn6.setFont(FontManager.getRunescapeFont());
/*  68 */     btnPanel.add(btn);
/*  69 */     btnPanel.add(btn2);
/*  70 */     btnPanel.add(btn3);
/*  71 */     btnPanel.add(btn4);
/*  72 */     btnPanel.add(btn5);
/*  73 */     btnPanel.add(btn6);
/*  74 */     btnPanel.add(btn7);
/*  75 */     btnPanel.add(btn8);
/*  76 */     btnPanel.add(btn9);
/*  77 */     btnPanel.add(btn10);
/*  78 */     this.playerPanel.add(btnPanel, "Center");
/*     */     
/*     */     JPanel viewPanel;
/*  81 */     (viewPanel = new JPanel()).setLayout(new GridLayout(0, 1));
/*     */     
/*     */     JLabel comp1;
/*  84 */     (comp1 = new JLabel("View distance", 0)).setFont(FontManager.getRunescapeFont());
/*  85 */     CmdSlider comp2 = new CmdSlider("View distance");
/*  86 */     viewPanel.add(comp1, Float.valueOf(0.5F));
/*  87 */     viewPanel.add(comp2);
/*     */     
/*  89 */     this.playerPanel.add(viewPanel, "South");
/*     */   }
/*     */   
/*     */   void createServerPanel() {
/*  93 */     this.serverPanel = new JPanel();
/*  94 */     this.serverPanel.setBackground(ColorScheme.DARKER_GRAY_COLOR);
/*  95 */     this.serverPanel.setBorder(new EmptyBorder(10, 10, 10, 10));
/*  96 */     this.serverPanel.setLayout(new BorderLayout(0, 10));
/*     */     
/*     */     JPanel btnPanel;
/*  99 */     (btnPanel = new JPanel()).setLayout(new GridLayout(0, 1));
/*     */     
/*     */     CmdButton btn;
/* 102 */     (btn = new CmdButton("Toggle LMS", "togglelms")).setFont(FontManager.getRunescapeFont());
/*     */     CmdButton btn2;
/* 104 */     (btn2 = new CmdButton("Toggle PK Tournaments", "togglepktournament")).setFont(FontManager.getRunescapeFont());
/*     */     CmdButton btn3;
/* 106 */     (btn3 = new CmdButton("Toggle VPN Blocker", "togglevpnblocker")).setFont(FontManager.getRunescapeFont());
/*     */     CmdButton btn4;
/* 108 */     (btn4 = new CmdButton("Toggle New Player Announcements", "togglenpa")).setFont(FontManager.getRunescapeFont());
/*     */     CmdButton btn5;
/* 110 */     (btn5 = new CmdButton("Toggle Referral System", "togglerefs")).setFont(FontManager.getRunescapeFont());
/*     */     CmdButton btn6;
/* 112 */     (btn6 = new CmdButton("Toggle Profanity Filter", "toggleprofanityfilter")).setFont(FontManager.getRunescapeFont());
/*     */     
/* 114 */     btnPanel.add(btn);
/* 115 */     btnPanel.add(btn2);
/* 116 */     btnPanel.add(btn3);
/* 117 */     btnPanel.add(btn4);
/* 118 */     btnPanel.add(btn5);
/* 119 */     btnPanel.add(btn6);
/* 120 */     this.serverPanel.add(btnPanel, "Center");
/*     */   }
/*     */   
/*     */   void createDevPanel() {
/* 124 */     this.devPanel = new JPanel();
/* 125 */     this.devPanel.setBackground(ColorScheme.DARKER_GRAY_COLOR);
/* 126 */     this.devPanel.setBorder(new EmptyBorder(10, 10, 10, 10));
/* 127 */     this.devPanel.setLayout(new BorderLayout(0, 10));
/*     */     
/*     */     JPanel btnPanel;
/* 130 */     (btnPanel = new JPanel()).setLayout(new GridLayout(0, 1));
/*     */     
/*     */     CmdButton btn;
/* 133 */     (btn = new CmdButton("Toggle debug", "debug")).setFont(FontManager.getRunescapeFont());
/*     */     CmdButton btn2;
/* 135 */     (btn2 = new CmdButton("Kill everyone in region", "killll")).setFont(FontManager.getRunescapeFont());
/*     */     CmdButton btn3;
/* 137 */     (btn3 = new CmdButton("Tele all", "teleall")).setFont(FontManager.getRunescapeFont());
/*     */     CmdButton btn4;
/* 139 */     (btn4 = new CmdButton("Test", "test")).setFont(FontManager.getRunescapeFont());
/*     */     
/* 141 */     btnPanel.add(btn);
/* 142 */     btnPanel.add(btn2);
/* 143 */     btnPanel.add(btn3);
/* 144 */     btnPanel.add(btn4);
/* 145 */     this.devPanel.add(btnPanel, "Center");
/*     */   }
/*     */   
/*     */   void createDangerPanel() {
/* 149 */     this.dangerPanel = new JPanel();
/* 150 */     this.dangerPanel.setBackground(ColorScheme.DARKER_GRAY_COLOR);
/* 151 */     this.dangerPanel.setBorder(new EmptyBorder(10, 10, 10, 10));
/* 152 */     this.dangerPanel.setLayout(new BorderLayout(0, 10));
/*     */     
/*     */     JPanel btnPanel;
/* 155 */     (btnPanel = new JPanel()).setLayout(new GridLayout(0, 1));
/*     */     
/*     */     CmdButton btn;
/* 158 */     (btn = new CmdButton("Shutdown server (1 min)", "shutdown 300")).setFont(FontManager.getRunescapeFont());
/*     */     
/* 160 */     btn.setFont(FontManager.getRunescapeFont());
/* 161 */     CmdButton btn2 = new CmdButton("Shutdown server (30 min)", "shutdown 1800");
/* 162 */     btn.setFont(FontManager.getRunescapeFont());
/* 163 */     CmdButton btn3 = new CmdButton("Restart VPS (1 min)", "vpsrestart 60");
/* 164 */     btn.setFont(FontManager.getRunescapeFont());
/* 165 */     CmdButton btn4 = new CmdButton("Restart VPS (5 min)", "vpsrestart 300");
/* 166 */     btn.setFont(FontManager.getRunescapeFont());
/* 167 */     CmdButton btn5 = new CmdButton("Restart VPS (30 min)", "vpsrestart 1800");
/* 168 */     btn.setFont(FontManager.getRunescapeFont());
/*     */     
/* 170 */     btnPanel.add(btn);
/* 171 */     btnPanel.add(btn2);
/* 172 */     btnPanel.add(btn3);
/* 173 */     btnPanel.add(btn4);
/* 174 */     btnPanel.add(btn5);
/* 175 */     this.dangerPanel.add(btnPanel, "Center");
/*     */   }
/*     */   
/*     */   void init() {
/* 179 */     setLayout(new BorderLayout(0, 10));
/* 180 */     setBackground(ColorScheme.DARK_GRAY_COLOR);
/* 181 */     setBorder(new EmptyBorder(10, 10, 10, 10));
/*     */     
/*     */     JPanel titlePanel;
/* 184 */     (titlePanel = new JPanel()).setLayout(new BorderLayout(0, 5));
/*     */     
/* 186 */     String[] petStrings = { "Player controls", "Server controls", "Dev controls", "Danger zone" };
/* 187 */     this.panelsComboBox = new JComboBox<>(petStrings);
/* 188 */     this.panelsComboBox.setSelectedIndex(0);
/* 189 */     this.panelsComboBox.addActionListener(e -> {
/*     */           int selectedIndex = this.panelsComboBox.getSelectedIndex();
/*     */           remove(this.activePanel);
/*     */           switch (selectedIndex) {
/*     */             case 0:
/*     */               this.activePanel = this.playerPanel;
/*     */               break;
/*     */             
/*     */             case 1:
/*     */               this.activePanel = this.serverPanel;
/*     */               break;
/*     */             
/*     */             case 2:
/*     */               this.activePanel = this.devPanel;
/*     */               break;
/*     */             case 3:
/*     */               this.activePanel = this.dangerPanel;
/*     */               break;
/*     */           } 
/*     */           add(this.activePanel, "South");
/*     */           revalidate();
/*     */           this.panelsComboBox.revalidate();
/*     */         });
/*     */     JLabel title;
/* 213 */     (title = new JLabel("Administrative controls")).setFont(FontManager.getRunescapeBoldFont());
/* 214 */     title.setFont(FontManager.getRunescapeSmallFont());
/* 215 */     titlePanel.add(title, "North");
/*     */     
/* 217 */     titlePanel.add(this.panelsComboBox, "Center");
/* 218 */     add(titlePanel, "North");
/*     */     
/* 220 */     createPlayerPanel();
/* 221 */     createServerPanel();
/* 222 */     createDevPanel();
/* 223 */     createDangerPanel();
/*     */     
/* 225 */     this.activePanel = this.playerPanel;
/* 226 */     add(this.activePanel, "Center");
/*     */   }
/*     */ }


/* Location:              C:\Users\brett\OneDrive\Desktop\Zeah Decompiled .java\zeah-client.jar\\utils\plugins\staff\AdminPanel.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */