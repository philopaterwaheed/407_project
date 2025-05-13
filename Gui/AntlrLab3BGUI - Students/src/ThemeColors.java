import java.awt.*;

public class ThemeColors {		Color background;
    Color foreground;
    Color accent;
    Color editorBackground;
    Color editorForeground;
    Color consoleBackground;
    Color consoleForeground;
    Color statusBarBackground;
    Color statusBarForeground;
    Color buttonBackground;
    Color buttonForeground;
    Color buttonHoverBackground;
    Color borderColor;
    Color tabBackground;
    Color tabForeground;
    Color selectionBackground;
    Color selectionForeground;

    // Light theme
    static ThemeColors lightTheme() {
         ThemeColors tc = new  ThemeColors();
        tc.background = Color.WHITE;
        tc.foreground = new Color(50, 50, 50);
        tc.accent = new Color(0, 102, 102);
        tc.editorBackground = Color.WHITE;
        tc.editorForeground = Color.BLUE;
        tc.consoleBackground = new Color(240, 240, 240);
        tc.consoleForeground = new Color(50, 50, 50);
        tc.statusBarBackground = new Color(0, 51, 102);
        tc.statusBarForeground = Color.WHITE;
        tc.buttonBackground = new Color(0, 122, 255);
        tc.buttonForeground = Color.WHITE;
        tc.buttonHoverBackground = new Color(0, 102, 255);
        tc.borderColor = new Color(200, 200, 200);
        tc.tabBackground = new Color(240, 240, 240);
        tc.tabForeground = new Color(50, 50, 50);
        tc.selectionBackground = new Color(184, 207, 229);
        tc.selectionForeground = Color.BLACK;
        return tc;
    }

    // Dark theme
    static  ThemeColors darkTheme() {
         ThemeColors tc = new  ThemeColors();
        tc.background = new Color(43, 43, 43);
        tc.foreground = new Color(187, 187, 187);
        tc.accent = new Color(0, 150, 150);
        tc.editorBackground = new Color(30, 30, 30);
        tc.editorForeground = new Color(169, 183, 198);
        tc.consoleBackground = new Color(43, 43, 43);
        tc.consoleForeground = new Color(187, 187, 187);
        tc.statusBarBackground = new Color(0, 30, 60);
        tc.statusBarForeground = Color.WHITE;
        tc.buttonBackground = new Color(59, 80, 120);
        tc.buttonForeground = new Color(48, 50, 50);
        tc.buttonHoverBackground = new Color(75, 110, 175);
        tc.borderColor = new Color(80, 80, 80);
        tc.tabBackground = new Color(50, 50, 50);
        tc.tabForeground = new Color(116, 124, 132);
        tc.selectionBackground = new Color(50, 80, 120);
        tc.selectionForeground = Color.WHITE;
        return tc;
    }
    static  ThemeColors draculaTheme() {
         ThemeColors tc = new  ThemeColors();
        tc.background = new Color(40, 42, 54);
        tc.foreground = new Color(248, 248, 242);
        tc.accent = new Color(189, 147, 249);
        tc.editorBackground = new Color(40, 42, 54);
        tc.editorForeground = new Color(248, 248, 242);
        tc.consoleBackground = new Color(33, 34, 44);
        tc.consoleForeground = new Color(248, 248, 242);
        tc.statusBarBackground = new Color(68, 71, 90);
        tc.statusBarForeground = new Color(248, 248, 242);
        tc.buttonBackground = new Color(98, 114, 164);
        tc.buttonForeground = new Color(248, 248, 242);
        tc.buttonHoverBackground = new Color(68, 71, 90);
        tc.borderColor = new Color(98, 114, 164);
        tc.tabBackground = new Color(33, 34, 44);
        tc.tabForeground = new Color(248, 248, 242);
        tc.selectionBackground = new Color(68, 71, 90);
        tc.selectionForeground = new Color(248, 248, 242);
        return tc;
    }

    static  ThemeColors monokaiTheme() {
         ThemeColors tc = new  ThemeColors();
        tc.background = new Color(39, 40, 34);
        tc.foreground = new Color(248, 248, 242);
        tc.accent = new Color(253, 151, 31);
        tc.editorBackground = new Color(39, 40, 34);
        tc.editorForeground = new Color(248, 248, 242);
        tc.consoleBackground = new Color(32, 33, 28);
        tc.consoleForeground = new Color(248, 248, 242);
        tc.statusBarBackground = new Color(73, 72, 62);
        tc.statusBarForeground = new Color(248, 248, 242);
        tc.buttonBackground = new Color(117, 113, 94);
        tc.buttonForeground = new Color(248, 248, 242);
        tc.buttonHoverBackground = new Color(73, 72, 62);
        tc.borderColor = new Color(117, 113, 94);
        tc.tabBackground = new Color(32, 33, 28);
        tc.tabForeground = new Color(248, 248, 242);
        tc.selectionBackground = new Color(73, 72, 62);
        tc.selectionForeground = new Color(248, 248, 242);
        return tc;
    }

    static  ThemeColors solarizedDarkTheme() {
         ThemeColors tc = new  ThemeColors();
        tc.background = new Color(0, 43, 54);
        tc.foreground = new Color(147, 161, 161);
        tc.accent = new Color(38, 139, 210);
        tc.editorBackground = new Color(0, 43, 54);
        tc.editorForeground = new Color(147, 161, 161);
        tc.consoleBackground = new Color(7, 54, 66);
        tc.consoleForeground = new Color(147, 161, 161);
        tc.statusBarBackground = new Color(7, 54, 66);
        tc.statusBarForeground = new Color(147, 161, 161);
        tc.buttonBackground = new Color(38, 139, 210);
        tc.buttonForeground = new Color(253, 246, 227);
        tc.buttonHoverBackground = new Color(42, 161, 242);
        tc.borderColor = new Color(38, 139, 210);
        tc.tabBackground = new Color(7, 54, 66);
        tc.tabForeground = new Color(147, 161, 161);
        tc.selectionBackground = new Color(7, 54, 66);
        tc.selectionForeground = new Color(147, 161, 161);
        return tc;
    }

    static  ThemeColors solarizedLightTheme() {
         ThemeColors tc = new  ThemeColors();
        tc.background = new Color(253, 246, 227);
        tc.foreground = new Color(101, 123, 131);
        tc.accent = new Color(38, 139, 210);
        tc.editorBackground = new Color(253, 246, 227);
        tc.editorForeground = new Color(101, 123, 131);
        tc.consoleBackground = new Color(238, 232, 213);
        tc.consoleForeground = new Color(101, 123, 131);
        tc.statusBarBackground = new Color(238, 232, 213);
        tc.statusBarForeground = new Color(101, 123, 131);
        tc.buttonBackground = new Color(38, 139, 210);
        tc.buttonForeground = new Color(253, 246, 227);
        tc.buttonHoverBackground = new Color(42, 161, 242);
        tc.borderColor = new Color(38, 139, 210);
        tc.tabBackground = new Color(238, 232, 213);
        tc.tabForeground = new Color(101, 123, 131);
        tc.selectionBackground = new Color(238, 232, 213);
        tc.selectionForeground = new Color(101, 123, 131);
        return tc;
    }
    static  ThemeColors nordTheme() {
         ThemeColors theme = new  ThemeColors();
        theme.background = new Color(46, 52, 64);        // Nord0
        theme.foreground = new Color(216, 222, 233);     // Nord4
        theme.accent = new Color(94, 129, 172);          // Nord9
        theme.editorBackground = new Color(59, 66, 82);  // Nord1
        theme.editorForeground = new Color(229, 233, 240); // Nord4
        theme.consoleBackground = new Color(67, 76, 94); // Nord2
        theme.consoleForeground = new Color(236, 239, 244); // Nord6
        theme.statusBarBackground = new Color(76, 86, 106); // Nord3
        theme.statusBarForeground = new Color(229, 233, 240); // Nord4
        theme.buttonBackground = new Color(67, 76, 94);  // Nord2
        theme.buttonForeground = new Color(236, 239, 244); // Nord6
        theme.buttonHoverBackground = new Color(94, 129, 172); // Nord9
        theme.borderColor = new Color(76, 86, 106);      // Nord3
        theme.tabBackground = new Color(59, 66, 82);     // Nord1
        theme.tabForeground = new Color(229, 233, 240);  // Nord4
        theme.selectionBackground = new Color(94, 129, 172); // Nord9
        theme.selectionForeground = new Color(236, 239, 244); // Nord6
        return theme;
    }

    // Gruvbox Dark theme
    static  ThemeColors gruvboxDarkTheme() {
         ThemeColors theme = new  ThemeColors();
        theme.background = new Color(40, 40, 40);        // bg0_h
        theme.foreground = new Color(235, 219, 178);     // fg
        theme.accent = new Color(250, 189, 47);          // yellow
        theme.editorBackground = new Color(29, 32, 33);  // bg0
        theme.editorForeground = new Color(235, 219, 178); // fg
        theme.consoleBackground = new Color(50, 48, 47); // bg1
        theme.consoleForeground = new Color(235, 219, 178); // fg
        theme.statusBarBackground = new Color(60, 56, 54); // bg2
        theme.statusBarForeground = new Color(235, 219, 178); // fg
        theme.buttonBackground = new Color(80, 73, 69);  // bg3
        theme.buttonForeground = new Color(235, 219, 178); // fg
        theme.buttonHoverBackground = new Color(146, 131, 116); // gray
        theme.borderColor = new Color(168, 153, 132);    // fg4
        theme.tabBackground = new Color(50, 48, 47);     // bg1
        theme.tabForeground = new Color(235, 219, 178);  // fg
        theme.selectionBackground = new Color(124, 111, 100); // bg4
        theme.selectionForeground = new Color(251, 241, 199); // fg0
        return theme;
    }

    // One Dark theme
    static  ThemeColors oneDarkTheme() {
         ThemeColors theme = new  ThemeColors();
        theme.background = new Color(40, 44, 52);        // main background
        theme.foreground = new Color(171, 178, 191);     // main foreground
        theme.accent = new Color(97, 175, 239);          // blue
        theme.editorBackground = new Color(33, 37, 43);  // editor bg
        theme.editorForeground = new Color(171, 178, 191); // editor fg
        theme.consoleBackground = new Color(40, 44, 52); // console bg
        theme.consoleForeground = new Color(171, 178, 191); // console fg
        theme.statusBarBackground = new Color(33, 37, 43); // status bar bg
        theme.statusBarForeground = new Color(171, 178, 191); // status bar fg
        theme.buttonBackground = new Color(54, 60, 72);  // button bg
        theme.buttonForeground = new Color(171, 178, 191); // button fg
        theme.buttonHoverBackground = new Color(62, 68, 81); // button hover
        theme.borderColor = new Color(61, 66, 77);       // border
        theme.tabBackground = new Color(40, 44, 52);     // tab bg
        theme.tabForeground = new Color(171, 178, 191);  // tab fg
        theme.selectionBackground = new Color(62, 68, 81); // selection bg
        theme.selectionForeground = new Color(171, 178, 191); // selection fg
        return theme;
    }

    // GitHub Dark theme
    static  ThemeColors githubDarkTheme() {
         ThemeColors theme = new  ThemeColors();
        theme.background = new Color(36, 41, 46);        // main background
        theme.foreground = new Color(201, 209, 217);     // main foreground
        theme.accent = new Color(88, 166, 255);          // blue
        theme.editorBackground = new Color(13, 17, 23);  // editor bg
        theme.editorForeground = new Color(201, 209, 217); // editor fg
        theme.consoleBackground = new Color(22, 27, 34); // console bg
        theme.consoleForeground = new Color(201, 209, 217); // console fg
        theme.statusBarBackground = new Color(22, 27, 34); // status bar bg
        theme.statusBarForeground = new Color(201, 209, 217); // status bar fg
        theme.buttonBackground = new Color(48, 54, 61);  // button bg
        theme.buttonForeground = new Color(201, 209, 217); // button fg
        theme.buttonHoverBackground = new Color(58, 64, 71); // button hover
        theme.borderColor = new Color(48, 54, 61);       // border
        theme.tabBackground = new Color(36, 41, 46);     // tab bg
        theme.tabForeground = new Color(201, 209, 217);  // tab fg
        theme.selectionBackground = new Color(48, 54, 61); // selection bg
        theme.selectionForeground = new Color(201, 209, 217); // selection fg
        return theme;
    }

    static  ThemeColors catppuccinMochaTheme() {
         ThemeColors theme = new  ThemeColors();
        theme.background = new Color(30, 30, 46);        // base
        theme.foreground = new Color(205, 214, 244);     // text
        theme.accent = new Color(137, 180, 250);         // blue
        theme.editorBackground = new Color(24, 24, 37);  // mantle
        theme.editorForeground = new Color(205, 214, 244); // text
        theme.consoleBackground = new Color(17, 17, 27); // crust
        theme.consoleForeground = new Color(205, 214, 244); // text
        theme.statusBarBackground = new Color(24, 24, 37); // mantle
        theme.statusBarForeground = new Color(205, 214, 244); // text
        theme.buttonBackground = new Color(49, 50, 68);  // surface0
        theme.buttonForeground = new Color(205, 214, 244); // text
        theme.buttonHoverBackground = new Color(69, 71, 90); // surface1
        theme.borderColor = new Color(69, 71, 90);       // surface1
        theme.tabBackground = new Color(30, 30, 46);     // base
        theme.tabForeground = new Color(205, 214, 244);  // text
        theme.selectionBackground = new Color(88, 91, 112); // surface2
        theme.selectionForeground = new Color(205, 214, 244); // text
        return theme;
    }

    // Catppuccin Macchiato theme
    static  ThemeColors catppuccinMacchiatoTheme() {
         ThemeColors theme = new  ThemeColors();
        theme.background = new Color(36, 39, 58);        // base
        theme.foreground = new Color(202, 211, 245);     // text
        theme.accent = new Color(138, 173, 244);         // blue
        theme.editorBackground = new Color(30, 32, 48);  // mantle
        theme.editorForeground = new Color(202, 211, 245); // text
        theme.consoleBackground = new Color(24, 25, 38); // crust
        theme.consoleForeground = new Color(202, 211, 245); // text
        theme.statusBarBackground = new Color(30, 32, 48); // mantle
        theme.statusBarForeground = new Color(202, 211, 245); // text
        theme.buttonBackground = new Color(54, 58, 79);  // surface0
        theme.buttonForeground = new Color(202, 211, 245); // text
        theme.buttonHoverBackground = new Color(73, 77, 100); // surface1
        theme.borderColor = new Color(73, 77, 100);      // surface1
        theme.tabBackground = new Color(36, 39, 58);     // base
        theme.tabForeground = new Color(202, 211, 245);  // text
        theme.selectionBackground = new Color(91, 96, 120); // surface2
        theme.selectionForeground = new Color(202, 211, 245); // text
        return theme;
    }

    // Catppuccin Frappe theme
    static  ThemeColors catppuccinFrappeTheme() {
         ThemeColors theme = new  ThemeColors();
        theme.background = new Color(48, 52, 70);        // base
        theme.foreground = new Color(198, 208, 245);     // text
        theme.accent = new Color(140, 170, 238);         // blue
        theme.editorBackground = new Color(41, 44, 60);  // mantle
        theme.editorForeground = new Color(198, 208, 245); // text
        theme.consoleBackground = new Color(35, 38, 52); // crust
        theme.consoleForeground = new Color(198, 208, 245); // text
        theme.statusBarBackground = new Color(41, 44, 60); // mantle
        theme.statusBarForeground = new Color(198, 208, 245); // text
        theme.buttonBackground = new Color(65, 69, 89);  // surface0
        theme.buttonForeground = new Color(198, 208, 245); // text
        theme.buttonHoverBackground = new Color(82, 87, 109); // surface1
        theme.borderColor = new Color(82, 87, 109);      // surface1
        theme.tabBackground = new Color(48, 52, 70);     // base
        theme.tabForeground = new Color(198, 208, 245);  // text
        theme.selectionBackground = new Color(98, 104, 128); // surface2
        theme.selectionForeground = new Color(198, 208, 245); // text
        return theme;
    }

    // Catppuccin Latte theme
    static  ThemeColors catppuccinLatteTheme() {
         ThemeColors theme = new  ThemeColors();
        theme.background = new Color(239, 241, 245);     // base
        theme.foreground = new Color(76, 79, 105);       // text
        theme.accent = new Color(30, 102, 245);          // blue
        theme.editorBackground = new Color(230, 233, 239); // mantle
        theme.editorForeground = new Color(76, 79, 105);   // text
        theme.consoleBackground = new Color(220, 224, 232); // crust
        theme.consoleForeground = new Color(76, 79, 105);   // text
        theme.statusBarBackground = new Color(230, 233, 239); // mantle
        theme.statusBarForeground = new Color(76, 79, 105);   // text
        theme.buttonBackground = new Color(204, 208, 218);  // surface0
        theme.buttonForeground = new Color(76, 79, 105);    // text
        theme.buttonHoverBackground = new Color(188, 192, 204); // surface1
        theme.borderColor = new Color(188, 192, 204);       // surface1
        theme.tabBackground = new Color(239, 241, 245);     // base
        theme.tabForeground = new Color(76, 79, 105);       // text
        theme.selectionBackground = new Color(172, 176, 190); // surface2
        theme.selectionForeground = new Color(76, 79, 105);   // text
        return theme;
    }

}
