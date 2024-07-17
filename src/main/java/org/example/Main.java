package org.example;

public class Main {
    public static void main(String[] args) {

        Source source = new Source();
        source.setName("John");
        source.setAge(30);
        source.setDateTime("2021-01-01");

        Target target = SourceTargetMapper.INSTANCE.sourceToTarget(source);

        System.out.println("Name: " + target.getName());
        System.out.println("ROC Date: " + target.getRocDate());
        System.out.println("Age: " + target.getAge());

    }

}

