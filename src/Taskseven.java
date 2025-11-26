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
            childmassage = "This is a child class";
            System.out.println(super.parentmassage);
            System.out.println(childmassage);
        }
    }
}
