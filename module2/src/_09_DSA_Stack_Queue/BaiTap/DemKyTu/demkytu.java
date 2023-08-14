package _09_DSA_Stack_Queue.BaiTap.DemKyTu;

import java.util.HashMap;
import java.util.Map;

public class demkytu {
    public static void main(String[] args) {
        String inputString = "TRUONG DAI HOC CNTT & TT VIET HAN";
        String[] kytu = inputString.split("\\s+"); // Tách chuỗi thành mảng các từ

        Map<String, Integer> wordCountMap = new HashMap<>();

        for (String word : kytu) {
            word = word.toLowerCase(); // Chuyển đổi thành chữ thường để tránh phân biệt hoa thường
            if (wordCountMap.containsKey(word)) {
                // Nếu từ đã tồn tại trong map, tăng giá trị đếm lên 1
                wordCountMap.put(word, wordCountMap.get(word) + 1);
            } else {
                // Nếu từ chưa tồn tại trong map, thêm vào map với giá trị đếm là 1
                wordCountMap.put(word, 1);
            }
        }

        
        for (Map.Entry<String, Integer> entry : wordCountMap.entrySet()) {
            System.out.println(entry.getKey() + ": " + entry.getValue());
        }
    }
}
