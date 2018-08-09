class Exemplo {

    public static void main(String[] args) {

        System.out.println(teste(10));
    }

    public static int teste(int number){

        try {
            return number;
        }
        catch (Exception e){
            System.out.println(e.getMessage());
        }
        finally {
            System.out.println("FINALLY");
        }

        return 0;

    }
}