public enum ThemeType {
    DARK("Dark Theme"),
    LIGHT("Light Theme"),
    DRACULA("Dracula Theme"),
    MONOKAI("Monokai Theme"),
    SOLARIZED_DARK("Solarized Dark"),
    SOLARIZED_LIGHT("Solarized Light"),
    NORD("Nord Theme"),
    GRUVBOX_DARK("Gruvbox Dark"),
    ONE_DARK("One Dark"),
    GITHUB_DARK("GitHub Dark"),
    CATPPUCCIN_MOCHA("Catppuccin Mocha"),
    CATPPUCCIN_MACCHIATO("Catppuccin Macchiato"),
    CATPPUCCIN_FRAPPE("Catppuccin Frappe"),
    CATPPUCCIN_LATTE("Catppuccin Latte");


    private final String displayName;

    ThemeType(String displayName) {
        this.displayName = displayName;
    }

    @Override
    public String toString() {
        return displayName;
    }
}
