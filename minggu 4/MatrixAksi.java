public class MatrixAksi {
    public static void main(String[] args) {
        // membuat matriks random
        Matrix matriks_A = Matrix.random(2, 2);
        System.out.println("matriks A=");
        matriks_A.show();
        System.out.println();

        // transpose dari matriks A;
        Matrix hasil_Transpose = matriks_A.transpose();
        System.out.println("Matriks B=");
        hasil_Transpose.show();
        System.out.println();

        // matriks identitas
        Matrix hasilMatriks_Identitas = Matrix.identity(3);
        System.out.println("matriks c=");
        hasilMatriks_Identitas.show();
        System.out.println();

        // penjumlahan matriks A dan B
        Matrix hasil_JumlahMatriks = matriks_A.plus(hasil_Transpose);
        System.out.println("hasil penjumlahan matriks=");
        hasil_JumlahMatriks.show();
        System.out.println();

        // hasil kali 2 matriks
        Matrix hasil_kaliMatrix = matriks_A.times(hasil_Transpose);
        System.out.println("hasil perkalian matriks=");
        hasil_kaliMatrix.show();
    }
}
