    package EXAM;

    public abstract class SanPham {
        private static int idLast = 1;
        private int id;
        private int code;
        private String name;
        private  double price;
        private String made;
        public SanPham(int code, String name, double price, String made) {
            this.id = idLast;
            idLast++;
            this.code = code;
            this.name = name;
            this.price = price;
            this.made = made;
        }

        public int getId() {
            return id;
        }

        public void setId(int id) {
            this.id = id;
        }

        public int getCode() {
            return code;
        }

        public void setCode(int code) {
            this.code = code;
        }

        public String getName() {
            return name;
        }

        public void setName(String name) {
            this.name = name;
        }

        public double getPrice() {
            return price;
        }

        public void setPrice(double price) {
            this.price = price;
        }

        public String getMade() {
            return made;
        }

        public void setMade(String made) {
            this.made = made;
        }

        public void   myAbstractMethod() {


        }



        @Override
        public String toString() {
            return "TaiKhoan{" +
                    "id=" + id +
                    ", code=" + code +
                    ", name='" + name + '\'' +
                    ", price=" + price +
                    ", made='" + made + '\'' +
                    '}';
        }
    }
