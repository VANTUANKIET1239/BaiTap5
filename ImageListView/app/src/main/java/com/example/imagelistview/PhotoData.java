package com.example.imagelistview;

import java.net.PortUnreachableException;
import java.util.ArrayList;
import java.util.List;

public class PhotoData {
    public static List<Photo> photodata = new ArrayList<>();
    public  static ArrayList<Photo> GeneratePhotoData(){
        //ArrayList<Photo> photodata = new ArrayList<>();


/*        photodata.add(new Photo(0,"https://images5.content-hci.com/commimg/myhotcourses/blog/post/myhc_94121.jpg","Experience the Best of British Culture in the Heart of London","London is the capital city of England and one of the most popular tourist destinations in the world. Known for its rich history, stunning architecture, and vibrant cultural scene, London is a must-visit city for anyone interested in art, music, theatre, or fashion. From iconic landmarks like the Big Ben and the Tower Bridge to world-class museums like the British Museum and the National Gallery, there's something for everyone in London."));
        photodata.add(new Photo(1,"https://lp-cms-production.s3.amazonaws.com/public/2019-06/09a64fea2933f6da77ab07d671d1f678-south-korea.jpg?sharp=10&vib=20&w=1200","Discover the Ancient Wonders of China's Rich History and Culture", "China is a vast and diverse country with a rich history and culture that spans over thousands of years. From the Great Wall of China and the Terracotta Army to the Forbidden City and the ancient city of Xi'an, China is home to some of the world's most iconic landmarks and cultural treasures. Visitors can also experience the modern side of China in cities like Shanghai and Beijing, where towering skyscrapers, high-end shopping, and bustling nightlife offer a glimpse into the country's future."));
        photodata.add(new Photo(2, "https://media.timeout.com/images/105241469/image.jpg","Experience the Warm Hospitality and Natural Beauty of Vietnam","Vietnam is a beautiful country located in Southeast Asia that is known for its stunning natural landscapes, rich cultural heritage, and warm hospitality. From the lush green rice paddies of the Mekong Delta to the beautiful beaches of Nha Trang and the breathtaking Halong Bay, Vietnam offers visitors an unforgettable travel experience. The country is also home to some of the best food in the world, with delicious dishes like pho and banh mi that are sure to tantalize your taste buds."));
        photodata.add(new Photo(3,"https://ik.imagekit.io/tvlk/blog/2021/10/du-lich-canada-cover-1024x512.jpg?tr=dpr-2,w-675","Discover the Natural Wonders and Multicultural Charm of Canada","Canada is a vast and diverse country that is known for its stunning natural beauty, multicultural cities, and friendly people. From the rugged coastlines of British Columbia to the pristine lakes of Ontario and the picturesque mountains of Alberta, Canada is a paradise for nature lovers. Visitors can also explore the vibrant cities of Toronto, Vancouver, and Montreal, where a melting pot of cultures and cuisines create a unique and exciting travel experience."));
        photodata.add(new Photo(4,"https://a.cdn-hotels.com/gdcs/production74/d462/9fe21145-585c-4e7f-9373-24ed559ec010.jpg","Experience the Best of Korean Culture, from Traditional to Modern","Korea is a fascinating country located in East Asia that is known for its rich cultural heritage, cutting-edge technology, and delicious cuisine. From the historic palaces of Seoul to the modern skyscrapers of Busan, Korea offers visitors a diverse range of experiences that combine tradition and modernity. Visitors can also enjoy some of the best food in the world, including Korean barbecue, kimchi, and bibimbap, while exploring the country's unique cultural offerings like K-pop and traditional Hanbok attire."));*/
    return  (ArrayList<Photo>) photodata;
    }
    public static Photo GetImagebyId(int id){
        for (int i = 0 ;i < photodata.size(); i++){
            if(photodata.get(i).getId() == id ){
                return photodata.get(i);
            }
        }
        return null;
    }
    public static void AddPhotoData(Photo k){
        photodata.add(k);
    }
    public static int GetCount(){
        return photodata.size();
    }
}
