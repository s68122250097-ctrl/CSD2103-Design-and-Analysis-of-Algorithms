// กรณีศึกษาที่ 1: Array
// ระบบวิเคราะห์คะแนนสอบก่อนเรียนของนักศึกษา

public class ArrayCaseStudy {

    public static void main(String[] args) {

        // เก็บคะแนนของนักศึกษา 10 คน ไว้ใน Array
        int[] scores = {6, 8, 4, 9, 7, 5, 10, 3, 8, 2};

        int sum = 0;          // ตัวแปรเก็บผลรวมคะแนน
        int max = scores[0];  // สมมติให้คนแรกเป็นคะแนนสูงสุดก่อน
        int min = scores[0];  // สมมติให้คนแรกเป็นคะแนนต่ำสุดก่อน
        int countPass = 0;    // จำนวนคนที่ได้ตั้งแต่ 7 คะแนนขึ้นไป

        // 1. วนลูปเพื่อหาผลรวม คะแนนสูงสุด คะแนนต่ำสุด และนับคนที่ได้ >= 7
        for (int i = 0; i < scores.length; i++) {
            sum = sum + scores[i];

            if (scores[i] > max) {
                max = scores[i];
            }

            if (scores[i] < min) {
                min = scores[i];
            }

            if (scores[i] >= 7) {
                countPass++;
            }
        }

        // 2. คำนวณค่าเฉลี่ย (แปลงเป็น double เพื่อให้ได้ทศนิยม)
        double average = (double) sum / scores.length;

        // แสดงผลลัพธ์ข้อ 1-5
        System.out.println("===== ผลการวิเคราะห์คะแนนสอบก่อนเรียน =====");
        System.out.println("คะแนนรวมของนักศึกษาทั้งหมด : " + sum);
        System.out.println("คะแนนเฉลี่ย : " + average);
        System.out.println("คะแนนสูงสุด : " + max);
        System.out.println("คะแนนต่ำสุด : " + min);
        System.out.println("จำนวนนักศึกษาที่ได้คะแนนตั้งแต่ 7 คะแนนขึ้นไป : " + countPass + " คน");

        // 6. หาคะแนนที่ได้คะแนนต่ำกว่า 5
        System.out.println("\nนักศึกษาที่ควรได้รับการทบทวนเพิ่มเติม (คะแนนต่ำกว่า 5):");
        boolean hasLowScore = false; // เช็คว่ามีคนคะแนนต่ำกว่า 5 หรือไม่

        for (int i = 0; i < scores.length; i++) {
            if (scores[i] < 5) {
                // ใช้ i+1 แทนลำดับนักศึกษาคนที่ 1, 2, 3, ...
                System.out.println("- นักศึกษาคนที่ " + (i + 1) + " ได้คะแนน " + scores[i]);
                hasLowScore = true;
            }
        }

        if (!hasLowScore) {
            System.out.println("ไม่มีนักศึกษาที่ได้คะแนนต่ำกว่า 5");
        }
    }
}