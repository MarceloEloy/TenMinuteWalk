
public class TenMinuteWalk{
    public Boolean andar(char[] walk){
        Integer[][] colunaLoc = new Integer[20][20];
        for(int i = 0; i < 20; i++){
            for(int j = 0; j < 20; j++){
                colunaLoc[i][j] = 0;
            }
        }
        Boolean valid = true;
        int cartesianY = 11;
        int cartesianX = 11;
        colunaLoc[cartesianX][cartesianY] = 1;
        int ponto;
        for (char direction : walk) {
            if (direction == 'w'){
                cartesianX += 1;
                ponto = colunaLoc[cartesianX][cartesianY];
            } else if (direction == 'e'){
                cartesianX -= 1;
                ponto = colunaLoc[cartesianX][cartesianY];

            } else if(direction == 'n'){
                cartesianY += 1;
                ponto = colunaLoc[cartesianX][cartesianY];
            } else if (direction == 's'){
                cartesianY -= 1;
                ponto = colunaLoc[cartesianX][cartesianY];
            }else{
                ponto = 0;
            }
            valid = ponto == 1;
        }
        if (walk.length != 10){
            valid = false;
        }
        return valid;
    }
}