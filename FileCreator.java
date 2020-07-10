import java.awt.*;
import java.io.File;
import java.util.Scanner;

public class FileCreator {
    public  static void main(String[]args){
        System.out.println("enter the file name with its extension:");
        Scanner ss = new Scanner(System.in);
        boolean result;
        try {

            String filename, ex = "text",
                    extension,
                    name,
                    ex1 = "java",
                    nam;
            String str = ss.nextLine();
            if (str.equals("delete")) {
                System.out.println("so u would like to delete a file,enter file name and extension");
                    String dele=ss.nextLine();
                File fak = new File("C:/Users/Alok Hegde/Desktop/"+dele);
                if (fak.exists()) {
                    boolean delete = fak.delete();

                    System.out.println("file has been deleted : " + delete);
                }
            } else {
                for (int i = 0; i < str.length(); i++) {
                    char ch = str.charAt(i);//no problem till here
                    if (Character.isWhitespace(ch)) {
                        int q = i + 1;
                        extension = str.substring(q);//extension
                        filename = str.substring(0, i);//file name

                        if (extension.equals(ex1)) {//tests for java file
                            nam = filename + ".java";
                            System.out.println(nam);
                            File fala = new File("C:/Users/Alok Hegde/Desktop/" + nam);
                            if (fala.exists()) {
                                Desktop desktop = Desktop.getDesktop();
                                desktop.open(fala);
                                System.out.println("file exists");
                                break;
                            } else {
                                File ff = new File("C:/Users/Alok Hegde/Desktop/" + nam);
                                result = ff.createNewFile();
                                Desktop deskto = Desktop.getDesktop();
                                deskto.open(ff);
                                break;
                            }
                        }//end
                        if (extension.equals(ex)) {
                            name = filename + ".txt";
                            File fa = new File("C:/Users/Alok Hegde/Desktop/" + name);
                            if (fa.exists() == true) {
                                Desktop deskt = Desktop.getDesktop();
                                deskt.open(fa);
                                System.out.println("file exists");
                                break;
                            } else if (fa.exists() == false) {
                                File ffa = new File("C:/Users/Alok Hegde/Desktop/" + name);
                                result = ffa.createNewFile();
                                Desktop deskto = Desktop.getDesktop();
                                deskto.open(ffa);
                                System.out.println("file dosent exists,created");
                                break;

                            }
                        }
                    }


                }
            }
        }

        catch(Exception e)
        {
            e.printStackTrace();
        }

    }
}


