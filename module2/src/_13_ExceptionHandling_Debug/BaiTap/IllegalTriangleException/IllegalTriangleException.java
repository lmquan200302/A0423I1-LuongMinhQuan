package _13_ExceptionHandling_Debug.BaiTap.IllegalTriangleException;

public class IllegalTriangleException extends Exception {
    public IllegalTriangleException(String message) {
        super(message);
    }
    public static class TamGiac {
        private double canhA,canhB,canhC;

        public double getCanhA() {
            return canhA;
        }

        public void setCanhA(double canhA) {
            this.canhA = canhA;
        }

        public double getCanhB() {
            return canhB;
        }

        public void setCanhB(double canhB) {
            this.canhB = canhB;
        }

        public double getCanhC() {
            return canhC;
        }

        public void setCanhC(double canhC) {
            this.canhC = canhC;
        }

        public TamGiac(double canhA, double canhB, double canhC) throws IllegalTriangleException {
            this.canhA = canhA;
            this.canhB = canhB;
            this.canhC = canhC;
            if(canhA <= 0 || canhB <= 0 || canhC <= 0){
                throw new IllegalTriangleException("Canh cua tam giac phai co gia tri Duong");

        }
            else if (canhA + canhB <= canhC || canhA + canhC <= canhB || canhC + canhB <= canhA){
                throw new IllegalTriangleException("Gia tri cac canh tam giac khong hop le");

            }
        }
        }


}
