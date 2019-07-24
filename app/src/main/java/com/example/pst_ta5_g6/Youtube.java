package com.example.pst_ta5_g6;
//Esta clase solo contiene el APIKEY necesario para la seccion del video
class Youtube {
    public Youtube() {
    }
    private static final String Apikey="AIzaSyAl3Ye5pPJZLWaF7nR85Ri2PHs0awKAb90";
//Metodo getter para obtener el unico atributo de esta clase
    public static String getApikey() {
        return Apikey;
    }
}
