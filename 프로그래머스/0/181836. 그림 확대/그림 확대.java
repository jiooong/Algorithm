class Solution {
    public String[] solution(String[] picture, int k) {
        String[] answer = {};
        int picturenum = picture[0].length();
        int count = 0;
        String[] newPicture = new String[k*picture.length];

        for(int i=0; i<picture.length; i++){ // 가로 늘리기
            String[] str = picture[i].split("");
            String rem = "";
            for(int j=0; j<picturenum; j++){
                String mem = str[j];
                for(int z=0; z<k; z++){
                    rem += mem;
                }
            }
            picture[i] = rem;
        }

        for(int i=0; i<picture.length; i++){
            for(int j=0; j<k; j++){
                newPicture[count] = picture[i];
                count += 1;
            }
        }

        
        return newPicture;
    }
}