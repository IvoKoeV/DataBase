import java.util.ArrayList;

public class Database {
    private String mainFile;
    private ArrayList<Table> tables;

    public Database(String mainFile, ArrayList<Table> tables) {
        this.mainFile = mainFile;
        this.tables = tables;
    }

    public String getMainFile() {
        return mainFile;
    }

    public void setMainFile(String mainFile) {
        this.mainFile = mainFile;
    }

    public ArrayList<Table> getTables() {
        return tables;
    }

    public void setTables(ArrayList<Table> tables) {
        this.tables = tables;
    }
}

