public class SimpleAgenda {

    static String[] listName = new String[6]; // store the names
    static int index=0;



    public static void main(String[] args) {
        System.out.println("Hello World!");
        int option=0;

        do {

            // afisare meniu
            System.out.println("1.Add a name");
            System.out.println("2.Print a name");
            System.out.println("3.Delete a name");
            System.out.println("4.Modify a name");


            //selectare optiune
            option=SkeletonJava.readIntConsole("Option:");

            switch (option) {
                case 1: add();break;
                case 2: print(listName);break;
                case 3:del();break;
                case 4:modify();break;


            }


        }
        while(option!=4);

    }

    static void add() {



        // de optimizat cand se umple agenda


        // de optimizat daca deja exista o pers cu acel nume

        if(index<listName.length) {
            String name = SkeletonJava.readStringConsole("Input the name:");
            listName[index] = name;
            index++;
        }
        else
        {
            System.out.println("Full memory");
        }
    }

    static void print(String listName[]) {

        for(int name =0;name<listName.length;name++){

            System.out.println("Your list of names is :" + name);
        }

    }

    static void del() {

        // citeste un nume
        // il cauta in array
        //daca il gaseste il sterge  asa listName[unde l-a gasit]=null sau "";
        String searchName =();
        boolean foundName =false;

        for(int i =0;i<listName.length;i++){

            if(searchName==listName);{
                foundName=true;
                listName = null;
            }
            System.out.println("The name is deleted");
        }



        }



    static void modify() {

        // citeste un nume
        // il cauta in array
        // daca il gaseste cere noul nume si il substituie pe cel vechi cu cel nou
    }


}
