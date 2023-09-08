/*      */ package com.rs;
/*      */ import java.awt.CardLayout;
/*      */ import java.awt.Color;
/*      */ import java.awt.Desktop;
/*      */ import java.awt.Dimension;
/*      */ import java.awt.Rectangle;
/*      */ import java.awt.SystemTray;
/*      */ import java.awt.Toolkit;
/*      */ import java.awt.TrayIcon;
/*      */ import java.awt.event.MouseAdapter;
/*      */ import java.awt.event.MouseEvent;
/*      */ import java.awt.event.WindowAdapter;
/*      */ import java.awt.event.WindowEvent;
/*      */ import java.net.URL;
/*      */ import java.util.Properties;
/*      */ import javax.swing.JFrame;
/*      */ import javax.swing.JOptionPane;
/*      */ import javax.swing.JPanel;
/*      */ import javax.swing.ToolTipManager;
/*      */ import javax.swing.UIManager;
/*      */ import ui.ClientUI;
/*      */ import ui.ColorScheme;
/*      */ import utils.GameStates;
/*      */ import utils.MouseManager;
/*      */ import utils.plugins.PluginManager.PluginManager;
/*      */ import utils.plugins.impl.zeah.ZeahConfig;
/*      */ import utils.plugins.impl.zeah.ZeahPlugin;
/*      */ import utils.plugins.settings.config.WarningOnExit;
/*      */ 
/*      */ public class Loader extends Applet {
/*   31 */   private static final Properties client_parameters = new Properties();
/*      */   
/*      */   private static final long serialVersionUID = 7639088664641445302L;
/*      */   public static Loader singleton;
/*      */   public static JPanel gamePanel;
/*      */   
/*      */   public static GameStates getGameState() {
/*   38 */     return gameState;
/*      */   }
/*      */   
/*      */   public static void setGameState(GameStates gameState) {
/*   42 */     Loader.gameState = gameState;
/*      */   }
/*      */   
/*   45 */   public static GameStates gameState = GameStates.STARTING; public static ClientPluginToolbar pluginToolbar;
/*      */   
/*      */   public static void main(String[] args) {
/*   48 */     System.setErr(new oe(System.err));
/*      */     
/*   50 */     SwingUtilities.invokeLater(() -> {
/*      */           try {
/*      */             initLoader();
/*      */             
/*      */             return;
/*   55 */           } catch (Exception exception) {
/*      */             null.printStackTrace();
/*      */             return;
/*      */           } 
/*      */         });
/*      */   }
/*      */ 
/*      */   
/*   63 */   public static CardLayout cardLayout = new CardLayout();
/*      */   
/*   65 */   private static final Rectangle sidebarButtonPosition = new Rectangle(); public static ClientUI clientUI; private static final String CONFIG_GROUP = "window"; private static final String CONFIG_CLIENT_BOUNDS = "clientBounds"; private static final String CONFIG_CLIENT_MAXIMIZED = "clientMaximized"; private static final String CONFIG_CLIENT_SIDEBAR_CLOSED = "clientSidebarClosed";
/*      */   private static TrayIcon trayIcon;
/*      */   private static JFrame frame;
/*      */   
/*      */   private static void initLoader() throws Exception {
/*   70 */     System.setProperty("java.net.preferIPv4Stack", "true");
/*   71 */     System.setProperty("java.net.preferIPv6Addresses", "false");
/*   72 */     setParams();
/*      */     
/*   74 */     PluginManager.loadConfig();
/*      */     
/*   76 */     if (System.getProperty("os.name").toLowerCase().contains("mac")) {
/*      */       
/*   78 */       try { UIManager.setLookAndFeel(UIManager.getSystemLookAndFeelClassName());
/*   79 */         setLookAndFeel(); }
/*      */       
/*   81 */       catch (Throwable throwable) { null.printStackTrace(); }
/*      */     
/*      */     } else {
/*      */ 
/*      */       
/*   86 */       try { setLookAndFeel();
/*      */         
/*      */          }
/*      */       
/*   90 */       catch (Throwable throwable) { null.printStackTrace();
/*   91 */         System.out.println("Theme not detected, reverting to MetalLookAndFeel.");
/*      */         
/*   93 */         try { UIManager.setLookAndFeel("javax.swing.plaf.metal.MetalLookAndFeel"); }
/*      */         
/*   95 */         catch (Throwable throwable1) { null.printStackTrace();
/*   96 */           System.out.println("Theme not detected, reverting to OS Default.");
/*      */           
/*   98 */           try { UIManager.setLookAndFeel(UIManager.getSystemLookAndFeelClassName()); }
/*      */           
/*  100 */           catch (Throwable throwable2) { null.printStackTrace(); }
/*      */            }
/*      */          }
/*      */     
/*      */     } 
/*      */     
/*  106 */     lO client = new lO();
/*      */     
/*  108 */     Loader loader = new Loader();
/*  109 */     lO.a(loader);
/*      */     
/*      */     JPanel panel;
/*  112 */     (panel = gamePanel = new JPanel()).setLayout(new BorderLayout());
/*  113 */     panel.add(loader);
/*  114 */     panel.setPreferredSize(new Dimension((int)(15.0D + 768.0D * oE.BG()), (int)(15.0D + 503.0D * oE.BG())));
/*  115 */     panel.setBackground(Color.BLACK);
/*      */     
/*  117 */     MouseManager mouseManager = new MouseManager();
/*      */     
/*  119 */     (clientUI = new ClientUI(mouseManager, loader, false, "Zeah.gg - RuneLite frame")).init(gamePanel);
/*      */     
/*  121 */     (frame = (JFrame)clientUI.getFrame()).setMinimumSize(new Dimension(768, 503));
/*  122 */     ZeahConfig config = (ZeahConfig)PluginManager.getPlugin(ZeahPlugin.class).getConfig();
/*      */     
/*  124 */     frame.setAlwaysOnTop(config.gameAlwaysOnTop());
/*      */     
/*  126 */     frame.setTitle("Zeah");
/*  127 */     frame.setResizable(true);
/*      */ 
/*      */ 
/*      */     
/*  131 */     frame.setDefaultCloseOperation(0);
/*  132 */     frame.addWindowListener(new WindowAdapter()
/*      */         {
/*      */           public final void windowClosing(WindowEvent windowEvent) {
/*      */             ZeahConfig zeahConfig;
/*  136 */             if ((zeahConfig = (ZeahConfig)((PluginManager.getPlugin(ZeahPlugin.class) != null) ? PluginManager.getPlugin(ZeahPlugin.class).getConfig() : null)) == null || (zeahConfig.warningOnExit() != WarningOnExit.ALWAYS && (zeahConfig
/*  137 */               .warningOnExit() != WarningOnExit.LOGGED_IN || lO.tQ() != 0)) || 
/*  138 */               JOptionPane.showConfirmDialog(Loader.frame, "Are you sure you would like to exit?", "Warning: Client will close!", 0, 3) == 0) {
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */               
/* 1150 */               Loader.saveClientBoundsConfig();
/* 1151 */               if (Loader.trayIcon != null)
/* 1152 */                 SystemTray.getSystemTray().remove(Loader.trayIcon); 
/* 1153 */               System.exit(0);
/*      */             } 
/*      */           }
/*      */         });
/*      */     frame.setIconImage(Toolkit.getDefaultToolkit().getImage(ClassLoader.getSystemResource("com/rs/icon.png")));
/*      */     frame.pack();
/*      */     if (config.rememberScreenBounds()) {
/*      */       Rectangle clientBounds;
/*      */       if ((clientBounds = (Rectangle)PluginManager.getSingleton().getConfiguration("window", "clientBounds", Rectangle.class)) != null) {
/*      */         frame.setBounds(clientBounds);
/*      */         if (ClientUI.findDisplayFromBounds(clientBounds) == null) {
/*      */           System.out.println("Reset client position. Client bounds: " + clientBounds.x + "x" + clientBounds.y + "x" + clientBounds.width + "x" + clientBounds.height);
/*      */           frame.setLocationRelativeTo(frame.getOwner());
/*      */         } 
/*      */       } else {
/*      */         frame.setLocationRelativeTo(frame.getOwner());
/*      */       } 
/*      */       if (PluginManager.getSingleton().getConfiguration("window", "clientMaximized") != null)
/*      */         frame.setExtendedState(6); 
/*      */     } else {
/*      */       frame.setLocationRelativeTo(frame.getOwner());
/*      */     } 
/*      */     if (config.enableTrayIcon())
/*      */       setTrayIcon(); 
/*      */     frame.setVisible(true);
/*      */     frame.toFront();
/*      */     client.init();
/*      */     lO.start();
/*      */     mg.init();
/*      */   }
/*      */   
/*      */   public static void saveClientBoundsConfig() {
/*      */     if (((PluginManager.getPlugin(ZeahPlugin.class) != null) ? PluginManager.getPlugin(ZeahPlugin.class).getConfig() : null) == null)
/*      */       return; 
/*      */     PluginManager configManager = PluginManager.getSingleton();
/*      */     clientUI.getPluginPanel();
/*      */     Rectangle bounds = frame.getBounds();
/*      */     if (clientUI.isSidebarOpen())
/*      */       bounds.width -= 225; 
/*      */     if ((frame.getExtendedState() & 0x6) != 0) {
/*      */       configManager.setConfiguration("window", "clientBounds", bounds);
/*      */       configManager.setConfiguration("window", "clientMaximized", Boolean.TRUE);
/*      */       return;
/*      */     } 
/*      */     configManager.unsetConfiguration("window", "clientMaximized");
/*      */     configManager.setConfiguration("window", "clientBounds", bounds);
/*      */   }
/*      */   
/*      */   private static void setLookAndFeel() throws UnsupportedLookAndFeelException {
/*      */     UIManager.setLookAndFeel((LookAndFeel)new SubstanceRuneLiteLookAndFeel());
/*      */     ToolTipManager.sharedInstance().setLightWeightPopupEnabled(false);
/*      */     ToolTipManager.sharedInstance().setInitialDelay(300);
/*      */     JPopupMenu.setDefaultLightWeightPopupEnabled(false);
/*      */     UIManager.put("Button.foreground", Color.WHITE);
/*      */     UIManager.put("MenuItem.foreground", Color.WHITE);
/*      */     UIManager.put("Panel.background", ColorScheme.DARK_GRAY_COLOR);
/*      */     UIManager.put("TextField.selectionBackground", ColorScheme.BRAND_ORANGE_TRANSPARENT);
/*      */     UIManager.put("TextField.selectionForeground", Color.WHITE);
/*      */     UIManager.put("FormattedTextField.selectionBackground", ColorScheme.BRAND_ORANGE_TRANSPARENT);
/*      */     UIManager.put("FormattedTextField.selectionForeground", Color.WHITE);
/*      */     UIManager.put("TextArea.selectionBackground", ColorScheme.BRAND_ORANGE_TRANSPARENT);
/*      */     UIManager.put("TextArea.selectionForeground", Color.WHITE);
/*      */     System.setProperty("jgoodies.popupDropShadowEnabled", "false");
/*      */     System.setProperty("sun.awt.noerasebackground", "true");
/*      */   }
/*      */   
/*      */   public static void removeTrayIcon() {
/*      */     if (trayIcon != null)
/*      */       SystemTray.getSystemTray().remove(trayIcon); 
/*      */     trayIcon = null;
/*      */   }
/*      */   
/*      */   public static void setTrayIcon() {
/*      */     if (!SystemTray.isSupported())
/*      */       return; 
/*      */     try {
/*      */       SystemTray tray = SystemTray.getSystemTray();
/*      */       (trayIcon = new TrayIcon(Toolkit.getDefaultToolkit().getImage(ClassLoader.getSystemResource("com/rs/icon.png")), "Zeah RSPS")).setImageAutoSize(true);
/*      */       trayIcon.addMouseListener(new MouseAdapter() {
/*      */             public final void mouseClicked(MouseEvent e) {
/*      */               Loader.frame.setVisible(true);
/*      */               Loader.frame.setState(0);
/*      */             }
/*      */           });
/*      */       tray.add(trayIcon);
/*      */       return;
/*      */     } catch (AWTException aWTException) {
/*      */       System.err.println("TrayIcon could not be added.");
/*      */       return;
/*      */     } 
/*      */   }
/*      */   
/*      */   static void setParams() {
/*      */     client_parameters.put("separate_jvm", "true");
/*      */     client_parameters.put("boxbgcolor", "black");
/*      */     client_parameters.put("image", "http://www.runescape.com/img/game/splash2.gif");
/*      */     client_parameters.put("centerimage", "true");
/*      */     client_parameters.put("boxborder", "false");
/*      */     client_parameters.put("java_arguments", "-Xmx1024m -Xss2m -Dsun.java2d.noddraw=true -XX:CompileThreshold=1500 -Xincgc -XX:+UseConcMarkSweepGC -XX:+UseParNewGC");
/*      */     client_parameters.put("27", "0");
/*      */     client_parameters.put("1", "0");
/*      */     client_parameters.put("16", "false");
/*      */     client_parameters.put("17", "false");
/*      */     client_parameters.put("21", "1");
/*      */     client_parameters.put("30", "false");
/*      */     client_parameters.put("20", oE.clO);
/*      */     client_parameters.put("29", "");
/*      */     client_parameters.put("11", "true");
/*      */     client_parameters.put("25", "1378752098");
/*      */     client_parameters.put("28", "0");
/*      */     client_parameters.put("8", ".runescape.com");
/*      */     client_parameters.put("23", "false");
/*      */     client_parameters.put("32", "0");
/*      */     client_parameters.put("15", "wwGlrZHF5gKN6D3mDdihco3oPeYN2KFybL9hUUFqOvk");
/*      */     client_parameters.put("0", "IjGJjn4L3q5lRpOR9ClzZQ");
/*      */     client_parameters.put("2", "");
/*      */     client_parameters.put("4", "1");
/*      */     client_parameters.put("14", "");
/*      */     client_parameters.put("5", "8194");
/*      */     client_parameters.put("-1", "QlwePyRU5GcnAn1lr035ag");
/*      */     client_parameters.put("6", "0");
/*      */     client_parameters.put("24", "true,false,0,43,200,18,0,21,354,-15,Verdana,11,0xF4ECE9,candy_bar_middle.gif,candy_bar_back.gif,candy_bar_outline_left.gif,candy_bar_outline_right.gif,candy_bar_outline_top.gif,candy_bar_outline_bottom.gif,loadbar_body_left.gif,loadbar_body_right.gif,loadbar_body_fill.gif,6");
/*      */     client_parameters.put("3", "$@33wqErt>-,NUk/^^}^=;YQS(M6cZ@M");
/*      */     client_parameters.put("12", "false");
/*      */     client_parameters.put("13", "0");
/*      */     client_parameters.put("26", "0");
/*      */     client_parameters.put("9", "77");
/*      */     client_parameters.put("22", "false");
/*      */     client_parameters.put("18", "false");
/*      */     client_parameters.put("33", "");
/*      */     client_parameters.put("haveie6", "false");
/*      */   }
/*      */   
/*      */   public String getParameter(String string) {
/*      */     return (String)client_parameters.get(string);
/*      */   }
/*      */   
/*      */   public URL getDocumentBase() {
/*      */     return getCodeBase();
/*      */   }
/*      */   
/*      */   public URL getCodeBase() {
/*      */     try {
/*      */       return new URL("http://" + oE.clN);
/*      */     } catch (Exception exception) {
/*      */       null.printStackTrace();
/*      */       return null;
/*      */     } 
/*      */   }
/*      */   
/*      */   public static void openURL(String url) {
/*      */     try {
/*      */       Desktop.getDesktop().browse(new URI(url));
/*      */       return;
/*      */     } catch (IOException|java.net.URISyntaxException iOException) {
/*      */       null.printStackTrace();
/*      */       return;
/*      */     } 
/*      */   }
/*      */ }


/* Location:              C:\Users\brett\OneDrive\Desktop\Zeah Decompiled .java\zeah-client.jar!\com\rs\Loader.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */