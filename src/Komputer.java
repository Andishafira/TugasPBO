public class Komputer {

        private CPU cpu = new CPU();
        Komputer(){}

        public void memasang(CPU cpu){
                this.cpu = cpu;
                System.out.println("CPU : "+this.cpu.getCPUData()+" GHz dipasang");
        }
        public void mencabut(){
                System.out.println("CPU : "+this.cpu.getCPUData()+" GHz dicabut");
        }
        public void cetakinfo(){
                System.out.println("Spesifikasi :\n CPU : "+cpu.getCPUData()+"GHz");
        }

}
