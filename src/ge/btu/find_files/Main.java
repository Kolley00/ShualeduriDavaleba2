package ge.btu.find_files;

import java.io.File;

public class Main {


    public static void main(String[] args) {

        File folder = new File("C:/Users/Administrator/IdeaProjects/andrew-kolosov_2/src/ge/btu/BTU_DOCUMENT/");
        File[] listOfFiles = folder.listFiles();

        assert listOfFiles != null;
        for (File file : listOfFiles) {
            if (file.isFile()) {
                try {
                    Thread.sleep(3000);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
                System.out.println(file.getName());
            }
        }
    }
}