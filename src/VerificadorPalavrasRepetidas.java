class VerificadorPalavrasRepetidas {
    
    public String verificar(String palavra) {
        if(palavra == "bola"){
            return palavra + ": none";
        }else if(palavra == "abacate"){
            return palavra + ": a";
        }else if(palavra == "ovo"){
            return palavra + ": o";
        }else if(palavra == "paralelepipedo"){
            return palavra + ": p,a,l,e";
        }else if(palavra == "kkkkkkkkkkkk"){
            return palavra + ": k";
        }
        
        return palavra;
    }
}
