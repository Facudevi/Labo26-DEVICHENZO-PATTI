package entregas_drones;

public class Distancia {

    public static double calcularDistancia(double latitud, double longitud, double latDestino, double longDestino) {
        double lat1Rad = Math.toRadians(latitud);
        double lon1Rad = Math.toRadians(longitud);
        double lat2Rad = Math.toRadians(latDestino);
        double lon2Rad = Math.toRadians(longDestino);

        double dLat = lat2Rad - lat1Rad;
        double dLon = lon2Rad - lon1Rad;

        double a = Math.sin(dLat / 2) * Math.sin(dLat / 2) +
                Math.cos(lat1Rad) * Math.cos(lat2Rad) * Math.sin(dLon / 2) * Math.sin(dLon / 2);
        double c = 2 * Math.atan2(Math.sqrt(a), Math.sqrt(1 - a));
        double radioTierraKm = 6371;

        return radioTierraKm * c;
    }
}