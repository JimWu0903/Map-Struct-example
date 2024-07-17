package org.example;




public class Main {
    public static void main(String[] args) {

        Source source = new Source();
        source.setName("John");
        source.setAge(30);

        Target target = SourceTargetMapper.INSTANCE.sourceToTarget(source);

        System.out.println("Full Name: " + target.getFullName());
        System.out.println("Age: " + target.getAge());

    }

}

