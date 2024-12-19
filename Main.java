//TIP 要<b>运行</b>代码，请按 <shortcut actionId="Run"/> 或
// 点击装订区域中的 <icon src="AllIcons.Actions.Execute"/> 图标。
import java.util.Scanner;
import java.util.ArrayList;

public class Main {
    private  static ArrayList GadgetList = new ArrayList<>();
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("'What do you want?'says Doreamon");
        while (true) {
            System.out.println("1 add gadget");
            System.out.println("2 delete gadget");
            System.out.println("3 show gadget list ");
            System.out.println("4 exit");
            System.out.println("Choose number");
            int choice = input.nextInt();
            switch (choice) {
                case 1:
                    addGadGet(input);
                    break;
                case 2:
                   deleteGadGet(input);
                   break;
                case 3:
                    listGadget();
                    break;
                case 4:
                    System.out.println("Bye bye");
                    input.close();
                    return;
                default:
                    System.out.println("error");
            }
        }
    }
    private static void addGadGet (Scanner scanner){
        System.out.println("Enter gadGet details");
        System.out.println("Enter the name:");
        String name = scanner.next();
        System.out.println("Enter the function:");
        String function = scanner.next();
        System.out.println("Enter the shape:");
        String shape = scanner.next();
        System.out.println("Enter the number:");
        int number = scanner.nextInt();
        GadGet gadGet = new GadGet(name,function,shape,number);
        GadgetList.add(gadGet);
        System.out.println("Doreamon travels to the future and gets it:"+gadGet.getName());
    }
    private static void deleteGadGet(Scanner scanner){
        if (GadgetList.isEmpty()){
            System.out.println("Doreamon has nothing to be deleted");
            return;
        }
    System.out.print("Enter the name to be deleted");
        String nameToDelete = scanner.next();
        boolean removed = GadgetList.removeIf(GadGet ->GadGet.toString().contains(nameToDelete));
        if (removed){
            System.out.println("it has been deleted successfully");
        }
        else {
            System.out.println("not found this gadget named  " + nameToDelete);
        }
    }
    private static void listGadget(){
        if (GadgetList.isEmpty()){
            System.out.println("Doreamon's pocket is empty");
        }
   else {
       System.out.println("Here are all Doreamon's gadgets:");
       for (int i =0 ;i< GadgetList.size();i++){
           System.out.println(GadgetList.get(i));
       }
        }
    }
}