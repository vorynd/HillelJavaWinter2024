package homework15;

public class FontImpl implements Font {
    private final String[] zero = {
            "  ______  ",
            " /      \\ ",
            "/$$$$$$$ |",
            "$$$  \\$$ |",
            "$$$$  $$ |",
            "$$ $$ $$ |",
            "$$ \\$$$$ |",
            "$$   $$$/ ",
            " $$$$$$/  "
    };
    private final String[] one = {
            "   __   ",
            " _/  |  ",
            "/ $$ |  ",
            "$$$$ |  ",
            "  $$ |  ",
            "  $$ |  ",
            " _$$ |_ ",
            "/ $$   |",
            "$$$$$$/ "
    };
    private final String[] two = {
            "  ______  ",
            " /      \\ ",
            "/$$$$$$  |",
            "$$____$$ |",
            " /    $$ |",
            "/$$$$$$$ /",
            "$$ |_____ ",
            "$$       |",
            "$$$$$$$$/ "
    };

    private final String[] three = {
            "  ______  ",
            " /      \\ ",
            "/$$$$$$  |",
            "$$ ___$$ |",
            "  /   $$< ",
            " _$$$$$  |",
            "/  \\__$$ |",
            "$$    $$ /",
            " $$$$$$/  "
    };
    private final String[] four = {
            " __    __ ",
            "/  |  /  |",
            "$$ |  $$ |",
            "$$ |__$$ |",
            "$$    $$ |",
            "$$$$$$$$ |",
            "      $$ |",
            "      $$ |",
            "      $$/ "
    };
    private final String[] five = {
            " _______  ",
            "/       | ",
            "$$$$$$$/  ",
            "$$ |____  ",
            "$$      \\ ",
            "$$$$$$$  |",
            "/  \\__$$ |",
            "$$    $$ /",
            " $$$$$$/  "
    };
    private final String[] six = {
            "  ______  ",
            " /      \\ ",
            "/$$$$$$$ |",
            "$$ \\__$$/ ",
            "$$      \\ ",
            "$$$$$$$$ |",
            "$$ \\__$$ |",
            "$$    $$ /",
            " $$$$$$/  "
    };
    private final String[] seven = {
            " ________ ",
            "/        |",
            "$$$$$$$$/ ",
            "    /$$/  ",
            "   /$$/   ",
            "  /$$/    ",
            " /$$/     ",
            "/$$/      ",
            "$$/       "
    };
    private final String[] eight = {
            "  ______  ",
            " /      \\ ",
            "/$$$$$$$ |",
            "$$ \\__$$ |",
            "$$    $$< ",
            " $$$$$$  |",
            "$$ \\__$$ |",
            "$$    $$ /",
            " $$$$$$/  "
    };
    private final String[] nine = {
            "  ______  ",
            " /      \\ ",
            "/$$$$$$$ |",
            "$$ \\__$$ |",
            "$$    $$ |",
            " $$$$$$$ |",
            "/  \\__$$ |",
            "$$    $$ /",
            " $$$$$$$/ "
    };
    private final String[][] font = {zero, one, two, three, four, five, six, seven, eight, nine};

    public String[][] getFont() {
        return font;
    }
}
