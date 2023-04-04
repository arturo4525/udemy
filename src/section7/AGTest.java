package section7;

public class AGTest {
    public static void main(String[] args) {
        for(int i = 1; 1 <= 5; i++){
            LPAStudent s = new LPAStudent("S92300" + i,
                    switch (i){
                        case 1 -> "Anders";
                        case 3 -> "Tim";
                        case 4 -> "Calle";
                        case 5 -> "Jocke";
                        default -> "Anonymous";
                    },
                    "1991/11/12",
                    "Java masterclass");

            System.out.println(i);
        }

    }

}
