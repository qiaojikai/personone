package designpattern.zuhe;





public class ImageFileLeaf extends AbstractFileComponent {

    public ImageFileLeaf(String name) {
        super(name);
    }

    public void add(AbstractFileComponent component) {
//        throw new NotImplementedException(this.getClass() + " not implemented this method");
    }

    public void remove(AbstractFileComponent component) {
//        throw new NotImplementedException(this.getClass() + " not implemented this method");
    }

    public void killVirus(int depth) {
        printDepth(depth);
        System.out.println("图片文件 [" + name + "]杀毒");
    }
}

class TextFileLeaf extends AbstractFileComponent {

    public TextFileLeaf(String name) {
        super(name);
    }

    @Override
    public void add(AbstractFileComponent component) {
//        throw new NotImplementedException(this.getClass() + " not implemented this method");
    }

    @Override
    public void remove(AbstractFileComponent component) {
//        throw new NotImplementedException(this.getClass() + " not implemented this method");
    }

    @Override
    public void killVirus(int depth) {
        printDepth(depth);
        System.out.println("文本文件 [" + name + "]杀毒");
    }
}

class VideoFileLeaf extends AbstractFileComponent {

    public VideoFileLeaf(String name) {
        super(name);
    }

    @Override
    public void add(AbstractFileComponent component) {
//        throw new NotImplementedException(this.getClass() + " not implemented this method");
    }

    @Override
    public void remove(AbstractFileComponent component) {
//        throw new NotImplementedException(this.getClass() + " not implemented this method");
    }

    @Override
    public void killVirus(int depth) {
        printDepth(depth);
        System.out.println("视频文件 [" + name + "]杀毒");
    }
}