public class Ps_02_02_encrypt_and_decrypt_grade {
    public static void main(String args[]){
        // encryption
        char grade = 'B';
        grade = (char)(grade + 8);
        System.out.println(grade);

        // Decryption
        grade = (char)(grade - 8);
        System.out.println(grade);
    } 
}
