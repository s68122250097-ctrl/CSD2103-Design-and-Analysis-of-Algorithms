// กรณีศึกษาที่ 3: Queue
// ระบบคิวผู้ป่วยในคลินิกสุขภาพ

import java.util.LinkedList;
import java.util.Queue;

public class QueueCaseStudy {

    public static void main(String[] args) {

        // สร้าง Queue สำหรับเก็บคิวผู้ป่วย โดยใช้ LinkedList เป็นตัว implement
        Queue<String> patientQueue = new LinkedList<>();

        // 1. เพิ่มผู้ป่วย P001 ถึง P005 ลงใน Queue
        patientQueue.add("P001");
        patientQueue.add("P002");
        patientQueue.add("P003");
        patientQueue.add("P004");
        patientQueue.add("P005");

        System.out.println("===== คิวผู้ป่วยเริ่มต้น =====");
        System.out.println(patientQueue);

        // 2. เรียกผู้ป่วยออกจากคิว 2 คน (ผู้ป่วยที่มาก่อนจะถูกเรียกก่อน)
        System.out.println("\n===== เรียกผู้ป่วยเข้ารับบริการ =====");
        for (int i = 1; i <= 2; i++) {

            // 7. ตรวจสอบก่อน remove() ว่า Queue ว่างหรือไม่
            if (!patientQueue.isEmpty()) {
                // remove() จะดึงคนที่อยู่หัวคิว (มาก่อนสุด) ออกมา
                String servedPatient = patientQueue.remove();
                System.out.println("เรียกผู้ป่วยหมายเลข " + servedPatient + " เข้ารับบริการ");
            } else {
                System.out.println("ไม่มีผู้ป่วยในคิวแล้ว");
            }
        }

        // 3. เพิ่มผู้ป่วยใหม่ P006 และ P007 เข้า Queue
        patientQueue.add("P006");
        patientQueue.add("P007");

        System.out.println("\n===== หลังจากมีผู้ป่วยใหม่ลงทะเบียนเพิ่ม =====");
        System.out.println(patientQueue);

        // 4. แสดงผู้ป่วยคนถัดไปด้วย peek() (ดูโดยไม่ดึงออกจากคิว)
        System.out.println("\nผู้ป่วยคนถัดไปที่จะได้รับบริการคือ : " + patientQueue.peek());

        // 5. แสดงจำนวนผู้ป่วยที่ยังรออยู่ด้วย size()
        System.out.println("จำนวนผู้ป่วยที่ยังรออยู่ทั้งหมด : " + patientQueue.size() + " คน");

        // 6. แสดงสถานะของ Queue หลังจากดำเนินการทั้งหมด
        System.out.println("\n===== สถานะของ Queue หลังดำเนินการทั้งหมด =====");
        System.out.println(patientQueue);

        // 8. อธิบายหลักการ FIFO ของ Queue
        System.out.println("\n===== หลักการทำงานของ Queue (FIFO) =====");
        System.out.println("Queue ทำงานแบบ FIFO คือ First In First Out");
        System.out.println("หมายถึงผู้ป่วยที่ลงทะเบียนก่อน จะได้รับบริการก่อนเสมอ");
        System.out.println("เช่น P001 ที่เข้าคิวเป็นคนแรก ก็จะถูกเรียกออกจากคิวเป็นคนแรก");
        System.out.println("ส่วนผู้ป่วยใหม่ที่มาลงทะเบียนภายหลัง เช่น P006 และ P007");
        System.out.println("จะต้องต่อท้ายคิว และรอให้ผู้ป่วยที่มาก่อนได้รับบริการจนหมดก่อน");
    }
}