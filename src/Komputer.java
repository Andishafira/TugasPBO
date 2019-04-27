public class Komputer {

        private CPU cpu = new CPU();

        Komputer(CPU cpu){
                this.cpu = cpu;
        }
        Komputer(){}

        public void memasang(CPU cpu){
                this.cpu = cpu;
                System.out.println("CPU : "+this.cpu.getCPUData()+" GHz dipasang");
        }
        public void mencabut(){
                System.out.println("CPU : "+this.cpu.getCPUData()+" GHz dicabut");
        }
        public void cetakinfo(){
                System.out.println("Spesifikasi : CPU : "+cpu.getCPUData()+" GHz");
        }

}
