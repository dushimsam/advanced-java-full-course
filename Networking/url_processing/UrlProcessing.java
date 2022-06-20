import java.net.URL;

class UrlProcessing{
    public static void main(String[] args) throws Exception{
        URL url = new URL("https://koreaautop.com/");

        System.out.println("URL : "+url.toString());
        System.out.println("Protocol : "+url.getProtocol());
        System.out.println("Host: "+url.getHost());
        System.out.println("Port: "+url.getPort());
        System.out.println("Path: "+url.getPath());
        System.out.println("Query: "+url.getQuery());
        System.out.println("Ref: "+url.getRef());
        System.out.println("File: "+url.getFile());
        System.out.println("Default port "+url.getDefaultPort());
        System.out.println("Authority: "+url.getAuthority());

    }
}