package co.com.ejercicio16;

class Person {
    //variables
    private String name = "";
    private int age = 0;
    private String DNI;
    private char sex = 0;
    private double weight = 0;
    private double height = 0;
    private final char[] letters = {'T', 'R', 'W',
            'A', 'G', 'M', 'Y', 'F', 'P', 'D',
            'X', 'B', 'N', 'J', 'Z', 'S', 'Q',
            'V', 'H', 'L', 'C', 'K', 'E'};

    //constructor por defecto


    public Person() {
    }

    //construtor name, age, sex
    public Person(String name, int age, char sex) {
        this.name = name;
        this.age = age;
        this.sex = sex;
    }

    //construcotr all
    public Person(String name, int age, char sex, double weight, double height) {
        this.name = name;
        this.age = age;
        this.DNI = DNI;
        this.sex = sex;
        this.weight = weight;
        this.height = height;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getDNI() {
        return DNI;
    }

    public char getSex() {
        return sex;
    }

    public void setSex(char sex) {
        this.sex = sex;
    }

    public double getWeight() {
        return weight;
    }

    public void setWeight(double weight) {
        this.weight = weight;
    }

    public double getHeight() {
        return height;
    }

    public void setHeight(double height) {
        this.height = height;
    }

    public int WorkOutIMC() {
        double weightWorkOut = weight / (Math.pow(height, 2));

        if (weightWorkOut >= 20 && weightWorkOut <= 25) {

            return 0;

        } else if (weightWorkOut < 20) {
            return -1;
        } else
            return -1;
    }

    public boolean isAdult() {
        boolean older = false;
        if (age >= 18) {
            older = true;
            return older;
        }
        return older;
    }
    // validar bien
    private String checkSex(){
        if(this.sex ==0){return "Hombre";
        }else {return "Mujer";
        }
    }

    @Override
    public String toString() {
        return "Persona" +  '\n'+
                "Nombre='" + name + '\n' +
                "Edad=" + age +
                "DNI='" + DNI + '\n' +
                "Sexo='" + sex + '\n' +
                "Peso=" + weight + '\n' +
                "Estatura=" + height;
    }
    private void generateDNI(){

        int numDNI = (int) (100000000 * Math.random());
        int rest = numDNI % 23;
        this.DNI = "" + numDNI + "" + letters[rest];
    }


}
