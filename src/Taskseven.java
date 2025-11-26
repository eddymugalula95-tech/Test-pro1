public class Taskseven {
    static class Parent {
        String parentmassage;

        Parent(){
            parentmassage = "This is a parent class";
        }
    }

    static class Child extends Parent {
        String childmassage;

        Child(){
            super();
            childmassage = "Changing the child name";
            System.out.println(super.parentmassage);
            System.out.println(childmassage);
        }
    }

    public static void main(String[] args) {
        final String university = "IUEA University";
        System.out.println("Welcome to " + university);
    }
}
