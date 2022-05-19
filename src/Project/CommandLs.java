package Project;

import java.io.File;
import java.io.PrintStream;
import java.text.SimpleDateFormat;
import java.util.Date;

public class CommandLs extends AbstractCommand {
    public CommandLs(File currentDirectory, String commandLine) {
        super(currentDirectory, commandLine);
    }

    public String formatDate(Date date) {
        SimpleDateFormat dateFormat = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
        return dateFormat.format(date);
    }

    public Date convertToDate(long unixTime) {
        return new Date(unixTime);
    }

    public void printTime(File file) {
        long time = file.lastModified();
        PrintStream var10000 = System.out;
        String var10001 = this.formatDate(this.convertToDate(time));
        var10000.print(var10001 + "   ");
    }

    public void printCheckDir(File file) {
        if (file.isDirectory()) {
            System.out.print("<DIR>   ");
        } else {
            System.out.print("        ");
        }

    }

    public void printCountSize(File file) {
        long size = file.length();
        int cnt = 0;

        String[] Size;
        for(Size = new String[]{"Byte", "KB", "MB", "GB", "TB"}; size > 1024L; ++cnt) {
            size /= 1024L;
        }

        System.out.printf("%4d %4s  ", size, Size[cnt]);
    }

    public File executeCommand() {
        File[] fileList = this.currentDirectory.listFiles();
        File[] var2 = fileList;
        int var3 = fileList.length;

        for(int var4 = 0; var4 < var3; ++var4) {
            File file = var2[var4];
            this.printTime(file);
            this.printCheckDir(file);
            this.printCountSize(file);
            System.out.println(file);
        }

        return this.currentDirectory;
    }
}
