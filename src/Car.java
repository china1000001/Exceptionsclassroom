public class Car implements AutoCloseable{
    public void Drive() {
        System.out.println("Машина журуп жатат");
    }
    @Override
    public void close() throws Exception {
        System.out.println("Машина жабылып жатат");
    }
}
