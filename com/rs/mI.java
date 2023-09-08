/*      */ package com.rs;
/*      */ 
/*      */ import com.a.a.a.r;
/*      */ import com.a.a.c.K;
/*      */ import utils.plugins.PluginManager.PluginManager;
/*      */ import utils.plugins.impl.TenXHitsPlugin;
/*      */ 
/*      */ public abstract class mi extends gQ {
/*      */   public int currentHP;
/*      */   public int index;
/*      */   public int bsW;
/*      */   public int bsX;
/*      */   public int bsY;
/*      */   public int bsZ;
/*      */   public int bta;
/*      */   public int btb;
/*      */   public oo[] btc;
/*      */   public r btd;
/*      */   public r bte;
/*      */   public int[] btf;
/*      */   public int[] btg;
/*      */   public int[] bth;
/*      */   public boolean[] bti;
/*      */   public nE[] btj;
/*      */   public int[] btk;
/*      */   public hz btl;
/*      */   public int[] btm;
/*      */   public int btn;
/*      */   public int bto;
/*      */   public int btp;
/*      */   public int btq;
/*      */   public int[] btr;
/*      */   public int[] bts;
/*      */   public int[] btt;
/*      */   public boolean btu;
/*      */   public int btv;
/*      */   public int btw;
/*      */   public int btx;
/*      */   public int bty;
/*      */   public int btz;
/*      */   public int btA;
/*      */   public int[] btB;
/*      */   public int btC;
/*      */   public int btD;
/*      */   public int btE;
/*      */   public int btF;
/*      */   public byte btG;
/*      */   public byte btH;
/*      */   public byte[] btI;
/*      */   public hz btJ;
/*      */   public p[] btK;
/*      */   public hz btL;
/*      */   public int btM;
/*      */   public int btN;
/*      */   public int btO;
/*      */   public byte btP;
/*      */   public boolean btQ;
/*      */   public int btR;
/*      */   public int[] btS;
/*      */   public boolean btT = true;
/*      */   public int btU;
/*      */   public int btV;
/*      */   public int btW;
/*      */   public int[] btX;
/*      */   public byte btY;
/*      */   public mO btZ;
/*      */   public int bua;
/*   68 */   private int bub = -1934893373;
/*      */   gF buc;
/*      */   int bud;
/*      */   int bue;
/*   72 */   int bug = -1532329984;
/*      */   
/*      */   int buh;
/*      */   
/*      */   int bui;
/*      */   
/*      */   kC buj;
/*      */   
/*      */   int buk;
/*      */   boolean bul;
/*      */   boolean bum;
/*      */   private byte bun;
/*      */   public int buo;
/*      */   
/*      */   mi(oC sceneObjectsManager, int i) {
/*   87 */     super(sceneObjectsManager, 0, 0, 0, 0, 0, 0, 0, 0, 0, false, (byte)0);
/*   88 */     this.buo = -1;
/*   89 */     this.bsY = 0;
/*   90 */     this.bsZ = -2135118589;
/*   91 */     this.bta = 0;
/*   92 */     this.buk = 0;
/*   93 */     this.bun = 0;
/*   94 */     this.btB = new int[-942466371 * ns.bLp.cri];
/*   95 */     this.btf = new int[-942466371 * ns.bLp.cri];
/*   96 */     this.btg = new int[-942466371 * ns.bLp.cri];
/*   97 */     this.bth = new int[ns.bLp.cri * -942466371];
/*   98 */     this.bti = new boolean[ns.bLp.cri * -942466371];
/*   99 */     this.btX = new int[ns.bLp.cri * -942466371];
/*  100 */     this.btk = new int[ns.bLp.cri * -942466371];
/*  101 */     this.btO = 1208121000;
/*  102 */     this.btn = 875976968;
/*  103 */     this.btQ = false;
/*  104 */     this.btq = -283914955;
/*  105 */     this.btt = null;
/*  106 */     this.btu = false;
/*  107 */     this.btd = new o(this);
/*  108 */     this.bte = new o(this);
/*  109 */     this.btE = -1828453179;
/*  110 */     this.btF = 473408095;
/*  111 */     this.btY = 0;
/*  112 */     this.btb = 0;
/*  113 */     this.btM = 0;
/*  114 */     this.btN = 1168822528;
/*  115 */     this.btl = new hz();
/*  116 */     this.btL = new hz();
/*  117 */     this.btJ = new hz();
/*  118 */     this.btR = 0;
/*  119 */     this.btU = 0;
/*  120 */     this.btV = 0;
/*  121 */     this.btW = 0;
/*  122 */     this.bul = false;
/*  123 */     this.bum = false;
/*  124 */     this.bua = -441346831;
/*  125 */     this.bui = -543663539;
/*  126 */     this.btS = new int[i];
/*  127 */     this.btr = new int[i];
/*  128 */     this.btI = new byte[i];
/*  129 */     this.btj = new nE[5];
/*  130 */     this.btc = new oo[4];
/*  131 */     for (int i_125_ = 0; i_125_ < 4; i_125_++)
/*  132 */       this.btc[i_125_] = new oo(this); 
/*  133 */     this.btK = new p[lf.bfE.aQU.length];
/*      */   }
/*      */   
/*      */   mi(oC sceneObjectsManager) {
/*  137 */     this(sceneObjectsManager, 10);
/*      */   }
/*      */   
/*      */   public final void d(int i, int i_0_, int i_1_, int i_2_, int i_3_, int i_4_, int i_5_, int i_6_) {
/*      */     try {
/*  142 */       if (vj())
/*  143 */         lO.a(this.btZ, this.btZ.vH(), -1, i, i_0_, i_1_, i_2_, i_3_, i_4_, i_5_, i_6_);  return;
/*      */     } catch (RuntimeException runtimeException) {
/*  145 */       throw K.a(null, "akn.cx()");
/*      */     } 
/*      */   }
/*      */ 
/*      */   
/*      */   final boolean os() {
/*  151 */     return false;
/*      */   }
/*      */ 
/*      */ 
/*      */ 
/*      */   
/*      */   public final void fk(int i) {
/*      */     try {
/*  159 */       if ((vd())
/*  160 */         .cnT * -2079528661 != 0 || 907865649 * this.btN != 0) {
/*  161 */         this.btl.pg();
/*      */         int i_9_;
/*  163 */         if ((i_9_ = i - 259411823 * this.btl.awP & 0x3FFF) > 8192) {
/*  164 */           this.bsX = (this.btl.awP * 259411823 - 16384 - i_9_) * 1874549911; return;
/*      */         } 
/*  166 */         this.bsX = (this.btl.awP * 259411823 + i_9_) * 1874549911;
/*      */       }  return;
/*      */     } catch (RuntimeException runtimeException) {
/*  169 */       throw K.a(null, "akn.a()");
/*      */     } 
/*      */   }
/*      */   
/*      */   public final void l(int i, boolean bool) {
/*      */     try {
/*  175 */       oM class350 = vd();
/*  176 */       if (bool || -2079528661 * class350.cnT != 0 || 907865649 * this.btN != 0) {
/*  177 */         this.bsX = (i & 0x3FFF) * 1874549911;
/*  178 */         this.btl.dL(2145248039 * this.bsX);
/*      */       }  return;
/*      */     } catch (RuntimeException runtimeException) {
/*  181 */       throw K.a(null, "akn.f()");
/*      */     } 
/*      */   }
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */   
/*      */   public final boolean bB(int i, int i_11_) {
/*      */     try {
/*  203 */       if (this.btm == null) {
/*  204 */         if (-1 == i_11_)
/*  205 */           return true; 
/*  206 */         this.btm = new int[lf.bfE.aQU.length];
/*  207 */         for (int i_13_ = 0; i_13_ < lf.bfE.aQU.length; i_13_++)
/*  208 */           this.btm[i_13_] = -1; 
/*      */       } 
/*  210 */       oM class350 = vd();
/*  211 */       int i_14_ = 256;
/*  212 */       if (class350.cnR != null && class350.cnR[i] > 0)
/*  213 */         i_14_ = class350.cnR[i]; 
/*  214 */       if (-1 == i_11_) {
/*  215 */         if (this.btm[i] == -1)
/*  216 */           return true; 
/*  217 */         int i_15_ = this.btl.pf();
/*  218 */         int i_16_ = this.btm[i];
/*      */         int i_17_;
/*  220 */         if ((i_17_ = i_15_ - i_16_) >= -i_14_ && i_17_ <= i_14_) {
/*  221 */           this.btm[i] = -1;
/*  222 */           for (int i_18_ = 0; i_18_ < lf.bfE.aQU.length; i_18_++) {
/*  223 */             if (this.btm[i_18_] != -1)
/*  224 */               return true; 
/*      */           } 
/*  226 */           this.btm = null;
/*  227 */           return true;
/*      */         } 
/*  229 */         if ((i_17_ > 0 && i_17_ <= 8192) || i_17_ <= -8192) {
/*  230 */           this.btm[i] = i_16_ + i_14_ & 0x3FFF;
/*      */         } else {
/*  232 */           this.btm[i] = i_16_ - i_14_ & 0x3FFF;
/*  233 */         }  return false;
/*      */       } 
/*  235 */       if (-1 == this.btm[i])
/*  236 */         this.btm[i] = this.btl.pf(); 
/*  237 */       int i_19_ = this.btm[i];
/*      */       int i_20_;
/*  239 */       if ((i_20_ = i_11_ - i_19_) >= -i_14_ && i_20_ <= i_14_) {
/*  240 */         this.btm[i] = i_11_;
/*  241 */         return true;
/*      */       } 
/*  243 */       if ((i_20_ > 0 && i_20_ <= 8192) || i_20_ <= -8192) {
/*  244 */         this.btm[i] = i_14_ + i_19_ & 0x3FFF;
/*      */       } else {
/*  246 */         this.btm[i] = i_19_ - i_14_ & 0x3FFF;
/*  247 */       }  return false;
/*      */     } catch (RuntimeException runtimeException) {
/*  249 */       throw K.a(null, "akn.i()");
/*      */     } 
/*      */   }
/*      */   
/*      */   public final void b(int graphicId, int positioning, int rotation, int i_23_, boolean bool, int graphicIndex) {
/*      */     try {
/*  255 */       oo graphics = this.btc[graphicIndex];
/*  256 */       int i_26_ = -967533709 * graphics.id;
/*  257 */       if (graphicId != -1 && i_26_ != -1)
/*  258 */         if (i_26_ == graphicId) {
/*      */           my class398;
/*  260 */           if ((class398 = J.Ap.fy(graphicId)).bwI && 1505778629 * class398.bwz != -1) {
/*      */             int i_27_;
/*      */             
/*  263 */             if ((i_27_ = (jS.aYU.ar(class398.bwz * 1505778629)).uv * -1117238071) == 0)
/*      */               return; 
/*  265 */             if (2 == i_27_) {
/*  266 */               graphics.cjd.aW();
/*      */               return;
/*      */             } 
/*      */           } 
/*      */         } else {
/*  271 */           my class398 = J.Ap.fy(graphicId);
/*  272 */           my class398_28_ = J.Ap.fy(i_26_);
/*  273 */           if (1505778629 * class398.bwz != -1 && 1505778629 * class398_28_.bwz != -1) {
/*  274 */             k class391 = jS.aYU.ar(1505778629 * class398.bwz);
/*  275 */             k class391_29_ = jS.aYU.ar(1505778629 * class398_28_.bwz);
/*  276 */             if (-1445588039 * class391.priority < class391_29_.priority * -1445588039) {
/*      */               return;
/*      */             }
/*      */           } 
/*      */         }  
/*  281 */       int i_30_ = 0;
/*  282 */       if (graphicId != -1 && !(J.Ap.fy(graphicId)).bwI)
/*  283 */         i_30_ = 2; 
/*  284 */       if (-1 != graphicId && bool)
/*  285 */         i_30_ = 1; 
/*  286 */       graphics.id = graphicId * 1313669563;
/*  287 */       graphics.cjc = i_23_ * 1533439965;
/*  288 */       graphics.height = 1755371497 * (positioning >> 16);
/*  289 */       graphics.cje = rotation * 1949040559;
/*  290 */       graphics.cjd.c((-1 != graphicId) ? ((J.Ap.fy(graphicId)).bwz * 1505778629) : -1, positioning & 0xFFFF, i_30_, false); return;
/*      */     } catch (RuntimeException runtimeException) {
/*  292 */       throw K.a(null, "akn.d()");
/*      */     } 
/*      */   }
/*      */   
/*      */   public final void vb() {
/*      */     try {
/*  298 */       this.btR = 0;
/*  299 */       this.btV = 0; return;
/*      */     } catch (RuntimeException runtimeException) {
/*  301 */       throw K.a(null, "akn.u()");
/*      */     } 
/*      */   }
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */   
/*      */   public final void a(int type, int damage, int soakingHitType, int soakingDamage, int cycle, int hitDelay, int hpPercentage, boolean associatedHit) {
/*      */     try {
/*  311 */       if (type == -1) {
/*      */         
/*  313 */         type = 8;
/*  314 */         damage = 0;
/*      */       } 
/*      */       
/*  317 */       if (PluginManager.isUsingOsrsHitmarkers()) {
/*  318 */         for (int i_45_ = 0; i_45_ < 4; i_45_++) {
/*  319 */           if (this.btg[i_45_] <= lO.boe * 443738891 || this.btB[i_45_] == 63) {
/*  320 */             this.btB[i_45_] = 0;
/*  321 */             this.btf[i_45_] = 0;
/*  322 */             this.btX[i_45_] = 0;
/*  323 */             this.btk[i_45_] = 0;
/*  324 */             this.btg[i_45_] = 0;
/*  325 */             this.bth[i_45_] = 0;
/*  326 */             this.bti[i_45_] = false;
/*      */           } 
/*      */         } 
/*      */       }
/*      */       
/*  331 */       if (!TenXHitsPlugin.active && damage > 0) {
/*  332 */         damage = (damage < 10) ? 1 : (int)Math.floor(damage / 10.0D);
/*      */       }
/*  334 */       if (!TenXHitsPlugin.active && soakingDamage > 0) {
/*  335 */         soakingDamage = (soakingDamage < 10) ? 1 : (int)Math.floor(soakingDamage / 10.0D);
/*      */       }
/*  337 */       boolean insertAtFirstIndex = true;
/*  338 */       boolean replaceIndex = true;
/*  339 */       for (int i = 0; i < (PluginManager.isUsingOsrsHitmarkers() ? 4 : (ns.bLp.cri * -942466371)); i++) {
/*  340 */         if (this.btg[i] > cycle) {
/*  341 */           insertAtFirstIndex = false;
/*      */         } else {
/*  343 */           replaceIndex = false;
/*      */         } 
/*      */       } 
/*      */       
/*  347 */       int index = -1;
/*  348 */       int replaceDamageOrDelay = -1;
/*  349 */       int defaultDelay = 0;
/*  350 */       if (type >= 0) {
/*      */         mM hitMarker;
/*  352 */         replaceDamageOrDelay = (hitMarker = lS.bqx.fF(type)).bzU * 100473069;
/*  353 */         defaultDelay = -169339039 * hitMarker.bzL;
/*      */         
/*  355 */         if (PluginManager.isUsingOsrsHitmarkers()) {
/*  356 */           defaultDelay = 75;
/*      */         }
/*      */       } 
/*  359 */       if (replaceIndex) {
/*      */ 
/*      */         
/*  362 */         if (replaceDamageOrDelay == -1)
/*      */           return; 
/*  364 */         index = 0;
/*  365 */         int leastValue = 0;
/*  366 */         if (replaceDamageOrDelay == 0) {
/*      */           
/*  368 */           leastValue = this.btg[0];
/*  369 */         } else if (replaceDamageOrDelay == 1) {
/*      */           
/*  371 */           leastValue = this.btf[0];
/*  372 */         }  for (int j = 1; j < (PluginManager.isUsingOsrsHitmarkers() ? 4 : (-942466371 * ns.bLp.cri)); j++) {
/*  373 */           if (replaceDamageOrDelay == 0) {
/*  374 */             if (this.btg[j] < leastValue) {
/*  375 */               index = j;
/*  376 */               leastValue = this.btg[j];
/*      */             } 
/*  378 */           } else if (1 == replaceDamageOrDelay && this.btf[j] < leastValue) {
/*  379 */             index = j;
/*  380 */             leastValue = this.btf[j];
/*      */           } 
/*      */         } 
/*  383 */         if (replaceDamageOrDelay == 1 && leastValue >= damage)
/*      */           return; 
/*      */       } else {
/*  386 */         if (insertAtFirstIndex)
/*  387 */           this.bun = 0; 
/*  388 */         for (int i_45_ = 0; i_45_ < (PluginManager.isUsingOsrsHitmarkers() ? 4 : (ns.bLp.cri * -942466371)); i_45_++) {
/*  389 */           int nextIndex = this.bun;
/*  390 */           this.bun = (byte)((this.bun + 1) % (PluginManager.isUsingOsrsHitmarkers() ? 4 : (-942466371 * ns.bLp.cri)));
/*  391 */           if (this.btg[nextIndex] <= cycle) {
/*  392 */             index = nextIndex;
/*      */             
/*      */             break;
/*      */           } 
/*      */         } 
/*      */       } 
/*  398 */       if (PluginManager.isUsingOsrsHitmarkers()) {
/*  399 */         for (int i_45_ = 0; i_45_ < 4; i_45_++) {
/*  400 */           if (this.btg[i_45_] <= lO.boe * 443738891) {
/*  401 */             if (i_45_ < index) {
/*  402 */               index = i_45_;
/*      */             }
/*      */             break;
/*      */           } 
/*      */         } 
/*      */       }
/*  408 */       if (index >= 0) {
/*      */         
/*  410 */         this.btB[index] = type;
/*  411 */         this.btf[index] = damage;
/*  412 */         this.btX[index] = soakingHitType;
/*  413 */         this.btk[index] = soakingDamage;
/*  414 */         this.btg[index] = hitDelay + cycle + defaultDelay;
/*  415 */         this.bth[index] = hpPercentage;
/*  416 */         this.bti[index] = associatedHit;
/*      */       }  return;
/*      */     } catch (RuntimeException runtimeException) {
/*  419 */       throw K.a(null, "akn.x()");
/*      */     } 
/*      */   }
/*      */   public int vc() {
/*      */     try {
/*      */       int i_47_;
/*  425 */       oM class350 = vd();
/*      */       
/*  427 */       if (1638157075 * class350.cnt != -1) {
/*  428 */         i_47_ = class350.cnt * 1638157075;
/*  429 */       } else if (-32768 == this.bug * 1507955715) {
/*  430 */         i_47_ = 200;
/*      */       } else {
/*  432 */         i_47_ = -(1507955715 * this.bug);
/*      */       }  bI class235;
/*  434 */       int i_48_ = (int)(class235 = By()).Ov.crc >> 9;
/*  435 */       int i_49_ = (int)class235.Ov.crd >> 9; gh class326;
/*  436 */       if (this.ask != null && i_48_ > 0 && i_49_ > 0 && i_48_ <= lO.blf.xa() - 1 && i_49_ <= lO.blf.xb() - 1 && (
/*      */         
/*  438 */         class326 = this.ask.ckG[this.asl][i_48_][i_49_]) != null && class326.amO != null) {
/*  439 */         return i_47_ + class326.amO.atm;
/*      */       }
/*  441 */       return i_47_;
/*      */     } catch (RuntimeException runtimeException) {
/*  443 */       throw K.a(null, "akn.bx()");
/*      */     } 
/*      */   }
/*      */   
/*      */   public final void fl(int i) {
/*      */     try {
/*  449 */       this.bub = i * -1934893373; return;
/*      */     } catch (RuntimeException runtimeException) {
/*  451 */       throw K.a(null, "akn.r()");
/*      */     } 
/*      */   }
/*      */   
/*      */   public int getSize() {
/*      */     try {
/*  457 */       return 1173963243 * this.bub;
/*      */     } catch (RuntimeException runtimeException) {
/*  459 */       throw K.a(null, "akn.q()");
/*      */     } 
/*      */   }
/*      */   
/*      */   public final void ou() {
/*      */     try {
/*  465 */       int i_51_ = (this.bub * 1173963243 - 1 << 8) + 240;
/*  466 */       oY class217 = (By()).Ov;
/*  467 */       this.ass = (short)((int)class217.crc - i_51_ >> 9);
/*  468 */       this.asp = (short)((int)class217.crd - i_51_ >> 9);
/*  469 */       this.asq = (short)((int)class217.crc + i_51_ >> 9);
/*  470 */       this.asr = (short)((int)class217.crd + i_51_ >> 9); return;
/*      */     } catch (RuntimeException runtimeException) {
/*  472 */       throw K.a(null, "akn.ew()");
/*      */     } 
/*      */   }
/*      */   
/*      */   final void b(nE meshRasterizer) {
/*      */     try {
/*  478 */       int i_52_ = this.btL.awP * 259411823;
/*  479 */       int i_53_ = 259411823 * this.btJ.awP;
/*  480 */       if (i_52_ != 0 || i_53_ != 0) {
/*  481 */         int i_54_ = meshRasterizer.YA() / 2;
/*  482 */         meshRasterizer.ia(0, -i_54_, 0);
/*  483 */         meshRasterizer.EA(i_52_ & 0x3FFF);
/*  484 */         meshRasterizer.t(i_53_ & 0x3FFF);
/*  485 */         meshRasterizer.ia(0, i_54_, 0);
/*      */       }  return;
/*      */     } catch (RuntimeException runtimeException) {
/*  488 */       throw K.a(null, "akn.n()");
/*      */     } 
/*      */   }
/*      */   
/*      */   final void a(AbstractRenderer class_ra, oM class350, int i, int i_55_, int i_56_, int i_57_) {
/*      */     
/*  494 */     try { for (int i_59_ = 0; i_59_ < this.btc.length; i_59_++) {
/*  495 */         byte i_60_ = 0;
/*  496 */         if (i_59_ == 0) {
/*  497 */           i_60_ = 2;
/*  498 */         } else if (1 == i_59_) {
/*  499 */           i_60_ = 5;
/*  500 */         } else if (i_59_ == 2) {
/*  501 */           i_60_ = 1;
/*  502 */         } else if (3 == i_59_) {
/*  503 */           i_60_ = 7;
/*  504 */         }  oo class56 = this.btc[i_59_];
/*  505 */         if (-1 != class56.id * -967533709 && !class56.cjd.aP()) {
/*      */           my class398;
/*  507 */           boolean bool = ((class398 = J.Ap.fy(class56.id * -967533709)).bwJ == 3 && (i_55_ != 0 || i_56_ != 0));
/*  508 */           int i_61_ = i;
/*  509 */           if (bool) {
/*  510 */             i_61_ |= 0x7;
/*      */           } else {
/*  512 */             if (0 != -885344433 * class56.cje)
/*  513 */               i_61_ |= 0x5; 
/*  514 */             if (0 != 1615294553 * class56.height)
/*  515 */               i_61_ |= 0x2; 
/*  516 */             if (class56.cjc * -1418960779 >= 0)
/*  517 */               i_61_ |= 0x7; 
/*      */           } 
/*  519 */           this.btj[i_59_ + 1] = class398.a(class_ra, i_61_, class56.cjd, i_60_); nE meshRasterizer;
/*  520 */           if ((meshRasterizer = class398.a(class_ra, i_61_, class56.cjd, i_60_)) != null) {
/*  521 */             if (class56.cjc * -1418960779 >= 0 && class350.cno != null && class350.cno[-1418960779 * class56.cjc] != null) {
/*  522 */               int i_62_ = 0;
/*  523 */               int i_63_ = 0;
/*  524 */               int i_64_ = 0;
/*  525 */               if (class350.cno != null && null != class350.cno[class56.cjc * -1418960779]) {
/*  526 */                 i_62_ = 0 + class350.cno[-1418960779 * class56.cjc][0];
/*  527 */                 i_63_ = 0 + class350.cno[-1418960779 * class56.cjc][1];
/*  528 */                 i_64_ = 0 + class350.cno[class56.cjc * -1418960779][2];
/*      */               } 
/*  530 */               if (class350.coc != null && null != class350.coc[class56.cjc * -1418960779]) {
/*  531 */                 i_62_ += class350.coc[-1418960779 * class56.cjc][0];
/*  532 */                 i_63_ += class350.coc[class56.cjc * -1418960779][1];
/*  533 */                 i_64_ += class350.coc[class56.cjc * -1418960779][2];
/*      */               } 
/*  535 */               if (i_64_ != 0 || i_62_ != 0) {
/*  536 */                 int i_65_ = i_57_;
/*  537 */                 if (this.btm != null && this.btm[class56.cjc * -1418960779] != -1)
/*  538 */                   i_65_ = this.btm[-1418960779 * class56.cjc]; 
/*      */                 int i_66_;
/*  540 */                 if ((i_66_ = i_65_ + -709199872 * class56.cje - i_57_ & 0x3FFF) != 0)
/*  541 */                   meshRasterizer.f(i_66_); 
/*  542 */                 int i_67_ = oX.SINE[i_66_];
/*      */                 
/*  544 */                 int i_68_, i_69_ = (i_68_ = oX.COSINE[i_66_]) * i_62_ + i_64_ * i_67_ >> 14;
/*  545 */                 i_64_ = i_68_ * i_64_ - i_67_ * i_62_ >> 14;
/*  546 */                 i_62_ = i_69_;
/*      */               } 
/*  548 */               meshRasterizer.ia(i_62_, i_63_, i_64_);
/*  549 */             } else if (class56.cje * -885344433 != 0) {
/*  550 */               meshRasterizer.f(-709199872 * class56.cje);
/*  551 */             }  if (class56.height * 1615294553 != 0)
/*  552 */               meshRasterizer.ia(0, -(1615294553 * class56.height) << 2, 0); 
/*  553 */             if (bool) {
/*  554 */               if (0 != -155466425 * this.buh)
/*  555 */                 meshRasterizer.t(this.buh * -155466425); 
/*  556 */               if (0 != -197572281 * this.bud)
/*  557 */                 meshRasterizer.EA(this.bud * -197572281); 
/*  558 */               if (0 != this.bue * -104151209)
/*  559 */                 meshRasterizer.ia(0, -104151209 * this.bue, 0); 
/*      */             } 
/*      */           } 
/*      */         } else {
/*  563 */           this.btj[i_59_ + 1] = null;
/*      */         } 
/*      */       }  return; }
/*  566 */     catch (RuntimeException runtimeException) { throw K.a(null, "akn.s()"); }
/*      */   
/*      */   }
/*      */   
/*      */   final void l(int i, int i_70_, int i_71_, int i_72_, int i_73_) {
/*      */     try {
/*  572 */       oY class217 = (By()).Ov;
/*  573 */       int i_75_ = this.asq + this.ass >> 1;
/*  574 */       int i_76_ = this.asp + this.asr >> 1;
/*  575 */       int i_77_ = oX.SINE[i];
/*  576 */       int i_78_ = oX.COSINE[i];
/*  577 */       int i_79_ = -i_70_ / 2;
/*  578 */       int i_80_ = -i_71_ / 2;
/*  579 */       int i_81_ = i_79_ * i_78_ + i_77_ * i_80_ >> 14;
/*  580 */       int i_82_ = i_78_ * i_80_ - i_77_ * i_79_ >> 14;
/*  581 */       int i_83_ = kM.k(i_81_ + (int)class217.crc, (int)class217.crd + i_82_, i_75_, i_76_, this.asl);
/*  582 */       int i_84_ = i_70_ / 2;
/*  583 */       int i_85_ = -i_71_ / 2;
/*  584 */       int i_86_ = i_84_ * i_78_ + i_77_ * i_85_ >> 14;
/*  585 */       int i_87_ = i_85_ * i_78_ - i_84_ * i_77_ >> 14;
/*  586 */       int i_88_ = kM.k(i_86_ + (int)class217.crc, (int)class217.crd + i_87_, i_75_, i_76_, this.asl);
/*  587 */       int i_89_ = -i_70_ / 2;
/*  588 */       int i_90_ = i_71_ / 2;
/*  589 */       int i_91_ = i_89_ * i_78_ + i_90_ * i_77_ >> 14;
/*  590 */       int i_92_ = i_78_ * i_90_ - i_77_ * i_89_ >> 14;
/*  591 */       int i_93_ = kM.k((int)class217.crc + i_91_, i_92_ + (int)class217.crd, i_75_, i_76_, this.asl);
/*  592 */       int i_94_ = i_70_ / 2;
/*  593 */       int i_95_ = i_71_ / 2;
/*  594 */       int i_96_ = i_78_ * i_94_ + i_77_ * i_95_ >> 14;
/*  595 */       int i_97_ = i_95_ * i_78_ - i_77_ * i_94_ >> 14;
/*  596 */       int i_98_ = kM.k(i_96_ + (int)class217.crc, i_97_ + (int)class217.crd, i_75_, i_76_, this.asl);
/*  597 */       int i_99_ = (i_83_ < i_88_) ? i_83_ : i_88_;
/*  598 */       int i_100_ = (i_93_ < i_98_) ? i_93_ : i_98_;
/*  599 */       int i_101_ = (i_88_ < i_98_) ? i_88_ : i_98_;
/*  600 */       int i_102_ = (i_83_ < i_93_) ? i_83_ : i_93_;
/*  601 */       this.buh = ((int)(Math.atan2((i_99_ - i_100_), i_71_) * 2607.5945876176133D) & 0x3FFF) * 1814320247;
/*  602 */       this.bud = ((int)(Math.atan2((i_102_ - i_101_), i_70_) * 2607.5945876176133D) & 0x3FFF) * -1037987721;
/*  603 */       if (0 != this.buh * -155466425 && i_72_ != 0) {
/*  604 */         int i_103_ = 16384 - i_72_;
/*  605 */         if (this.buh * -155466425 > 8192) {
/*  606 */           if (-155466425 * this.buh < i_103_)
/*  607 */             this.buh = i_103_ * 1814320247; 
/*  608 */         } else if (this.buh * -155466425 > i_72_) {
/*  609 */           this.buh = i_72_ * 1814320247;
/*      */         } 
/*  611 */       }  if (-197572281 * this.bud != 0 && i_73_ != 0) {
/*  612 */         int i_104_ = 16384 - i_73_;
/*  613 */         if (this.bud * -197572281 > 8192) {
/*  614 */           if (this.bud * -197572281 < i_104_)
/*  615 */             this.bud = i_104_ * -1037987721; 
/*  616 */         } else if (-197572281 * this.bud > i_73_) {
/*  617 */           this.bud = i_73_ * -1037987721;
/*      */         } 
/*  619 */       }  this.bue = (i_83_ + i_98_) * 1400968295;
/*  620 */       if (i_88_ + i_93_ < -104151209 * this.bue)
/*  621 */         this.bue = 1400968295 * (i_88_ + i_93_); 
/*  622 */       this.bue = 1400968295 * ((this.bue * -104151209 >> 1) - (int)class217.cre); return;
/*      */     } catch (RuntimeException runtimeException) {
/*  624 */       throw K.a(null, "akn.z()");
/*      */     } 
/*      */   }
/*      */   
/*      */   public final oM vd() {
/*      */     try {
/*  630 */       int i_105_ = vh();
/*  631 */       if (-1 == i_105_) {
/*  632 */         return oN.col;
/*      */       }
/*  634 */       return lA.biP.hx(i_105_);
/*      */     } catch (RuntimeException runtimeException) {
/*  636 */       throw K.a(null, "akn.y()");
/*      */     } 
/*      */   }
/*      */   
/*      */   public abstract int ve();
/*      */   
/*      */   public final void vf() {
/*      */     try {
/*  644 */       if (this.buj != null && null != this.buj.bdh) {
/*  645 */         this.buj.bdk -= -1979671751;
/*  646 */         if (this.buj.bdk * -1542462711 == 0)
/*  647 */           this.buj.bdh = null; 
/*      */       }  return;
/*      */     } catch (RuntimeException runtimeException) {
/*  650 */       throw K.a(null, "akn.v()");
/*      */     } 
/*      */   }
/*      */   
/*      */   public abstract boolean vg();
/*      */   
/*      */   public final void a(String string, int i, int i_106_, int i_107_) {
/*      */     try {
/*  658 */       if (this.buj == null)
/*  659 */         this.buj = new kC(); 
/*  660 */       this.buj.bdh = string;
/*  661 */       this.buj.bdg = i * -883265885;
/*  662 */       this.buj.bdi = i_106_ * -998781563;
/*  663 */       this.buj.bdk = (this.buj.bdj = i_107_ * -1166793105) * 1683680471; return;
/*      */     } catch (RuntimeException runtimeException) {
/*  665 */       throw K.a(null, "akn.br()");
/*      */     } 
/*      */   }
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */   
/*      */   public abstract int vh();
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */   
/*      */   private boolean fm(int i) {
/*      */     try {
/*  683 */       if (1097409519 * this.bua == i)
/*  684 */         return true; 
/*  685 */       this.btZ = nd.a(i, null, null, true);
/*  686 */       if (this.btZ == null)
/*  687 */         return false; 
/*  688 */       this.bua = i * 441346831;
/*  689 */       oo.a(this.btZ.bAd);
/*  690 */       return true;
/*      */     } catch (RuntimeException runtimeException) {
/*  692 */       throw K.a(null, "akn.cd()");
/*      */     } 
/*      */   }
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */   
/*      */   public final int on() {
/*      */     try {
/*  707 */       if (-32768 == this.bug * 1507955715)
/*  708 */         return 0; 
/*  709 */       return this.bug * 1507955715;
/*      */     } catch (RuntimeException runtimeException) {
/*  711 */       throw K.a(null, "akn.bm()");
/*      */     } 
/*      */   }
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */   
/*      */   public abstract kC vi();
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */   
/*      */   private boolean vj() {
/*      */     try {
/*  781 */       if (this.bui * 1992528251 == -1)
/*  782 */         return false; 
/*  783 */       return fm(1992528251 * this.bui);
/*      */     } catch (RuntimeException runtimeException) {
/*  785 */       throw K.a(null, "akn.cm()");
/*      */     } 
/*      */   }
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */   
/*      */   public final void i(int i, int i_115_, int i_116_, int i_117_, int i_118_, int i_119_, int i_120_) {
/*      */     try {
/*  801 */       if (!vj()) {
/*  802 */         if (-1 != i) {
/*  803 */           lO.bos[i] = true; return;
/*      */         } 
/*  805 */         for (int i_122_ = 0; i_122_ < 113; i_122_++)
/*  806 */           lO.bos[i_122_] = true; 
/*      */         return;
/*      */       } 
/*  809 */       ir.a(this.btZ.vH(), -1, i_115_, i_116_, i_117_, i_118_, i_119_, i_120_, i, false); return;
/*      */     } catch (RuntimeException runtimeException) {
/*  811 */       throw K.a(null, "akn.cp()");
/*      */     } 
/*      */   }
/*      */   
/*      */   public final void f(int i, int i_123_, boolean bool) {
/*      */     try {
/*  817 */       if (vj())
/*  818 */         hn.a(this.btZ.bAd, -1, i, i_123_, bool, (short)-1055);  return;
/*      */     } catch (RuntimeException runtimeException) {
/*  820 */       throw K.a(null, "akn.cq()");
/*      */     } 
/*      */   }
/*      */ 
/*      */ 
/*      */   
/*      */   final boolean oq() {
/*      */     try {
/*  828 */       return this.bum;
/*      */     } catch (RuntimeException runtimeException) {
/*  830 */       throw K.a(null, "akn.be()");
/*      */     } 
/*      */   }
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */   
/*      */   final void a(AbstractRenderer class_ra, nE[] meshRasterizers, nC aMatrix44Var, boolean bool) {
/*      */     try {
/*  845 */       if (!bool) {
/*  846 */         int i_126_ = 0;
/*  847 */         int i_127_ = 0;
/*  848 */         int i_128_ = 0;
/*  849 */         int i_129_ = 0;
/*  850 */         int i_130_ = -1;
/*  851 */         int i_131_ = -1;
/*  852 */         oh[][] particleEmitters = new oh[meshRasterizers.length][];
/*  853 */         kK[][] class68s = new kK[meshRasterizers.length][];
/*  854 */         for (int i_132_ = 0; i_132_ < meshRasterizers.length; i_132_++) {
/*  855 */           if (meshRasterizers[i_132_] != null) {
/*  856 */             meshRasterizers[i_132_].f(aMatrix44Var);
/*  857 */             particleEmitters[i_132_] = meshRasterizers[i_132_].xO();
/*  858 */             class68s[i_132_] = meshRasterizers[i_132_].xK();
/*  859 */             if (null != particleEmitters[i_132_]) {
/*  860 */               i_130_ = i_132_;
/*  861 */               i_127_++;
/*  862 */               i_126_ += (particleEmitters[i_132_]).length;
/*      */             } 
/*  864 */             if (class68s[i_132_] != null) {
/*  865 */               i_131_ = i_132_;
/*  866 */               i_129_++;
/*  867 */               i_128_ += (class68s[i_132_]).length;
/*      */             } 
/*      */           } 
/*      */         } 
/*  871 */         if ((this.buc == null || this.buc.apV) && (i_127_ > 0 || i_129_ > 0))
/*  872 */           this.buc = gF.g(lO.boe * 443738891, true); 
/*  873 */         if (this.buc != null) {
/*      */           oh[] particleEmitterS_133_; kK[] class68s_137_;
/*  875 */           if (i_127_ == 1) {
/*  876 */             particleEmitterS_133_ = particleEmitters[i_130_];
/*      */           } else {
/*  878 */             particleEmitterS_133_ = new oh[i_126_];
/*  879 */             int i_134_ = 0;
/*  880 */             for (int i_135_ = 0; i_135_ < meshRasterizers.length; i_135_++) {
/*  881 */               if (null != particleEmitters[i_135_]) {
/*  882 */                 System.arraycopy(particleEmitters[i_135_], 0, particleEmitterS_133_, i_134_, (particleEmitters[i_135_]).length);
/*  883 */                 i_134_ += (particleEmitters[i_135_]).length;
/*      */               } 
/*      */             } 
/*      */           } 
/*      */           
/*  888 */           if (i_129_ == 1) {
/*  889 */             class68s_137_ = class68s[i_131_];
/*      */           } else {
/*  891 */             class68s_137_ = new kK[i_128_];
/*  892 */             int i_138_ = 0;
/*  893 */             for (int i_139_ = 0; i_139_ < meshRasterizers.length; i_139_++) {
/*  894 */               if (class68s[i_139_] != null) {
/*  895 */                 System.arraycopy(class68s[i_139_], 0, class68s_137_, i_138_, (class68s[i_139_]).length);
/*  896 */                 i_138_ += (class68s[i_139_]).length;
/*      */               } 
/*      */             } 
/*      */           } 
/*  900 */           this.buc.a(class_ra, (443738891 * lO.boe), particleEmitterS_133_, class68s_137_);
/*  901 */           this.bul = true;
/*      */         } 
/*  903 */       } else if (this.buc != null) {
/*  904 */         this.buc
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */           
/* 1233 */           .apW = (lO.boe * 443738891);
/*      */       } 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */       
/*      */       if (this.buc != null) {
/* 2194 */         this.buc.apQ = this.asl;
/*      */       }
/*      */       return;
/*      */     } catch (RuntimeException runtimeException) {
/*      */       throw K.a(null, "akn.k()");
/*      */     } 
/*      */   }
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */   
/*      */   public final int vk() {
/*      */     try {
/*      */       boolean bool;
/*      */       oM class350 = vd();
/*      */       int i_140_ = 259411823 * this.btl.awP;
/*      */       if (class350.cnT * -2079528661 != 0) {
/*      */         bool = this.btl.z(this.bsX * 2145248039, -2079528661 * class350.cnT, class350.cnU * -1460258951);
/*      */       } else {
/*      */         bool = this.btl.z(this.bsX * 2145248039, 907865649 * this.btN, this.btN * 907865649);
/*      */       } 
/*      */       int i_141_;
/*      */       if ((i_141_ = 259411823 * this.btl.awP - i_140_) != 0) {
/*      */         this.btM += 1666755029;
/*      */       } else {
/*      */         this.btM = 0;
/*      */         this.btl.dL(2145248039 * this.bsX);
/*      */       } 
/*      */       if (bool) {
/*      */         if (0 != class350.cnC * 1496476593) {
/*      */           if (i_141_ > 0) {
/*      */             this.btL.z(class350.cnX * 1185872679, class350.cnC * 1496476593, 827802659 * class350.cnW);
/*      */           } else {
/*      */             this.btL.z(-(class350.cnX * 1185872679), 1496476593 * class350.cnC, class350.cnW * 827802659);
/*      */           } 
/*      */         }
/*      */         if (class350.cnw * 847512459 != 0) {
/*      */           this.btJ.z(-330229359 * class350.coa, 847512459 * class350.cnw, class350.cnZ * 1308368525);
/*      */         }
/*      */       } else {
/*      */         if (0 != 1496476593 * class350.cnC) {
/*      */           this.btL.z(0, class350.cnC * 1496476593, 827802659 * class350.cnW);
/*      */         } else {
/*      */           this.btL.dL(0);
/*      */         } 
/*      */         if (class350.cnw * 847512459 != 0) {
/*      */           this.btJ.z(0, 847512459 * class350.cnw, class350.cnZ * 1308368525);
/*      */         } else {
/*      */           this.btJ.dL(0);
/*      */         } 
/*      */       } 
/*      */       return i_141_;
/*      */     } catch (RuntimeException runtimeException) {
/*      */       throw K.a(null, "akn.b()");
/*      */     } 
/*      */   }
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */   
/*      */   public final void a(int[] is, int[] is_142_) {
/*      */     try {
/*      */       if (this.bts == null) {
/*      */         this.bts = new int[lf.bfE.aQU.length];
/*      */       }
/*      */       for (int i_143_ = 0; i_143_ < this.bts.length; i_143_++) {
/*      */         this.bts[i_143_] = -1;
/*      */       }
/*      */       for (int i_144_ = 0; i_144_ < is.length; i_144_++) {
/*      */         int i_145_ = is_142_[i_144_];
/*      */         int i_146_ = 0;
/*      */         while (i_146_ < this.bts.length) {
/*      */           if ((i_145_ & 0x1) != 0) {
/*      */             this.bts[i_146_] = is[i_144_];
/*      */           }
/*      */           i_146_++;
/*      */           i_145_ >>= 1;
/*      */         } 
/*      */       } 
/*      */       return;
/*      */     } catch (RuntimeException runtimeException) {
/*      */       throw K.a(null, "akn.p()");
/*      */     } 
/*      */   }
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */   
/*      */   public String getName() {
/*      */     if (this instanceof nO)
/* 2741 */       return ((nO)this).bXK.name; 
/*      */     if (this instanceof oj)
/*      */       return getName(); 
/*      */     return "Unknown " + getClass().getSimpleName();
/*      */   }
/*      */ }


/* Location:              C:\Users\brett\OneDrive\Desktop\Zeah Decompiled .java\zeah-client.jar!\com\rs\mi.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */