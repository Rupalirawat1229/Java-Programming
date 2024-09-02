public class ADMISSIONELIGIBLITY {
    public  static void main(String[]args){
                int math=72;
                int phy=65;
                int chem=51;
                int total=188;
                int total_m_p=137;

                if(math>=65 && phy>=55 && chem>=50){
                    System.out.println("eligible for admission");
                }else if(total>=190){
                    System.out.println("eligible for admission");
                }else if(total_m_p>=140){
                    System.out.println("eligible for admission");
                }else{
                    System.out.println("not eligible for admission");
                }
            }
        }

