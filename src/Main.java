public class Main {
    public static void main(String[] args) {
        System.out.println("Task 1");
        var dog =8;
        System.out.println(dog);
        var cat = 3.6;
        System.out.println(cat);
        var paper = 763789;
        System.out.println(paper);

        System.out.println("Task 2");
        dog+=4;
        System.out.println(dog);
        cat+=4;
        System.out.println(cat);
        paper+=4;
        System.out.println(paper);

        System.out.println("Task 3");
        dog = dog - 4; //d
        System.out.println(dog);
        cat = cat - 1.6;
        System.out.println(cat);
        paper-= 7639;
        System.out.println(paper);

        System.out.println("Task 4");
        var friend = 19;
        System.out.println(friend);
        friend+=2;
        System.out.println(friend);
        friend/=7;
        System.out.println(friend);

        System.out.println("Task 5");
        var frog = 3.5;
        System.out.println(frog);
        frog*=10;
        System.out.println(frog);
        frog/=3.5;
        System.out.println(frog);
        frog+=4;
        System.out.println(frog);

        System.out.println("Task 6");
        var boxer1Weight = 78.2;
        var boxer2Weight = 82.7;
        var totalWeight = boxer1Weight + boxer2Weight;
        System.out.println("Общий вес бойцов " + totalWeight);
        System.out.println("Разница в весе " + (boxer2Weight-boxer1Weight));

        System.out.println("Task 7");
        System.out.println("Разница в весе " + (boxer2Weight-boxer1Weight));
        System.out.println("Разница в весе " + (boxer2Weight%boxer1Weight));

    }
}