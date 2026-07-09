//กรณีศึกษาที่ 2: Stack
//ระบบ Undo ในโปรแกรมจดบันทึก

import java.util.Stack;

public class StackCaseStudy {

    public static void main(String[] args) {

        // สร้าง Stack สำหรับเก็บคำสั่งที่ผู้ใช้ทำ
        Stack<String> commandStack = new Stack<>();

        // 1. เพิ่มคำสั่งทั้งหมดลงใน Stack ตามลำดับที่ผู้ใช้ทำ
        commandStack.push("Type Data");
        commandStack.push("Type Structure");
        commandStack.push("Delete Structure");
        commandStack.push("Type Algorithm");
        commandStack.push("Type Java");

        // 2. แสดงคำสั่งทั้งหมดใน Stack (จากบนลงล่าง)
        System.out.println("===== คำสั่งทั้งหมดใน Stack =====");
        System.out.println(commandStack);

        // 3. Undo คำสั่งล่าสุด 2 ครั้ง
        System.out.println("\n===== เริ่มทำการ Undo =====");
        for (int i = 1; i <= 2; i++) {

            // 6. ตรวจสอบก่อน pop() ว่า Stack ว่างหรือไม่
            if (!commandStack.isEmpty()) {
                // pop() จะดึงคำสั่งบนสุด (ล่าสุด) ออกมา
                String undoneCommand = commandStack.pop();

                // 4. แสดงคำสั่งที่ถูก Undo
                System.out.println("Undo ครั้งที่ " + i + " : ยกเลิกคำสั่ง \"" + undoneCommand + "\"");
            } else {
                System.out.println("ไม่สามารถ Undo ได้ เนื่องจาก Stack ว่างแล้ว");
            }
        }

        // 5. แสดงสถานะของ Stack หลังจาก Undo
        System.out.println("\n===== สถานะของ Stack หลังจาก Undo =====");
        System.out.println(commandStack);

        // 7. อธิบายหลักการ LIFO ของ Stack
        System.out.println("\n===== หลักการทำงานของ Stack (LIFO) =====");
        System.out.println("Stack ทำงานแบบ LIFO คือ Last In First Out");
        System.out.println("หมายถึงคำสั่งที่ถูกเพิ่มเข้าไปหลังสุด (Type Java)");
        System.out.println("จะเป็นคำสั่งแรกที่ถูก Undo ออกไปก่อน ตามด้วย Type Algorithm");
        System.out.println("ซึ่งเหมาะกับระบบ Undo เพราะผู้ใช้มักต้องการยกเลิกสิ่งที่เพิ่งทำล่าสุดก่อนเสมอ");
    }
}