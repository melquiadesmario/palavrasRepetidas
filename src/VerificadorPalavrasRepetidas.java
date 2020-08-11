class VerificadorPalavrasRepetidas {
    
    public String verificar(String palavra) {
        /*if(palavra == "bola"){
            return palavra + ": none";
        }else if(palavra == "abacate"){
            return palavra + ": a";
        }else if(palavra == "ovo"){
            return palavra + ": o";
        }else if(palavra == "paralelepipedo"){
            return palavra + ": p,a,l,e";
        }else if(palavra == "kkkkkkkkkkkk"){
            return palavra + ": k";
        }*/
        char letra;
        String repetida = "";
        
        for(int i = 0; i <= palavra.length(); i++){
            
            letra = palavra.charAt(i);
            
            for(int j = 1; j <= palavra.length(); j++){
                
                if(letra == palavra.charAt(j)){
                    repetida += letra;
                    return repetida+": "+repetida;
                }else{
                    return palavra+": none";
                }
            }
        }
        
        return palavra;
    }
}
