package factory.valid.image;

/**
 * Source: https://sourcemaking.com/design_patterns/factory_method/java/1
 */
interface ImageReader {
    DecodedImage getDecodeImage();
}

/**
 * Source: https://sourcemaking.com/design_patterns/factory_method/java/1
 */
class DecodedImage {
    private String image;

    public DecodedImage(String image) {
        this.image = image;
    }

    @Override
    public String toString() {
        return image + ": is decoded";
    }
}

/**
 * Source: https://sourcemaking.com/design_patterns/factory_method/java/1
 */
class GifReader implements ImageReader {
    private DecodedImage decodedImage;

    public GifReader(String image) {
        this.decodedImage = new DecodedImage(image);
    }

    @Override
    public DecodedImage getDecodeImage() {
        return decodedImage;
    }
}

/**
 * Source: https://sourcemaking.com/design_patterns/factory_method/java/1
 */
class JpegReader implements ImageReader {
    private DecodedImage decodedImage;

    public JpegReader(String image) {
        decodedImage = new DecodedImage(image);
    }

    @Override
    public DecodedImage getDecodeImage() {
        return decodedImage;
    }
}

