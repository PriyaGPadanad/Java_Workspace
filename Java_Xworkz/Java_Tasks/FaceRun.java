class FaceRun {

    public static void main(String[] values) {

        String shape1 = "Oval";
        String skinTone1 = "Fair";
        String expression1 = "Smiling";

        Face face1 = new Face(shape1, skinTone1, expression1);
        System.out.println("face1 Shape:" + face1.shape);
        System.out.println("face1 Skin Tone:" + face1.skinTone);
        System.out.println("face1 Expression:" + face1.expression);

        Face face2 = new Face("Round", "Medium", "Neutral");
        System.out.println("face2 Shape:" + face2.shape);
        System.out.println("face2 Skin Tone:" + face2.skinTone);
        System.out.println("face2 Expression:" + face2.expression);

        Face face3 = new Face("Square", "Dark", "Frowning");
        System.out.println("face3 Shape:" + face3.shape);
        System.out.println("face3 Skin Tone:" + face3.skinTone);
        System.out.println("face3 Expression:" + face3.expression);

        Face face4 = new Face("Heart", "Light", "Surprised");
        System.out.println("face4 Shape:" + face4.shape);
        System.out.println("face4 Skin Tone:" + face4.skinTone);
        System.out.println("face4 Expression:" + face4.expression);

        Face face5 = new Face("Diamond", "Tan", "Laughing");
        System.out.println("face5 Shape:" + face5.shape);
        System.out.println("face5 Skin Tone:" + face5.skinTone);
        System.out.println("face5 Expression:" + face5.expression);
    }
}