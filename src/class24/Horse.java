package class24;

public class Horse {
    String name;
    String breed;
    String color;
    int age;
    double weight;

    public Horse(String name, String breed, String color, int age, double weight) {
        setName(name);
        setBreed(breed);
        setColor(color);
        setAge(age);
        setWeight(weight);
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        if(name.isEmpty()){
            System.out.println("Name can't be empty.");
        }else{
            this.name = name;
        }
    }

    public String getBreed() {
        return breed;
    }

    public void setBreed(String breed) {
        if(breed.isEmpty()){
            System.out.println("Breed can't be empty");
        }else{
            this.breed = breed;
        }
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        if(color.isEmpty()){
            System.out.println("Color can't be empty");
        }else{
            this.color = color;
        }
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        if(age>30){
            System.out.println("Please enter age less than 30 years");
        }else if(age<=0){
            System.out.println("Please enter age more than 0 years");
        }else{
            this.age = age;
        }
    }

    public double getWeight() {
        return weight;
    }

    public void setWeight(double weight) {
        if(weight<200){
            System.out.println("Please enter a weight more than 200 lbs");
        }else if(weight>600){
            System.out.println("Please enter a weight less than 600 lbs");
        }else{
            this.weight = weight;
        }
    }
}
