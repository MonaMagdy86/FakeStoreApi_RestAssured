package PojoClasses;

public class AddProduct {
    String title;
    String price;
    String descreption;
    String image;
    String category;
 public AddProduct(String title,String price,String descreption,String image,String category){
     this.title=title;
     this.price=price;
     this.descreption=descreption;
     this.image=image;
     this.category=category;
 }
    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getPrice() {
        return price;
    }

    public void setPrice(String price) {
        this.price = price;
    }

    public String getDescreption() {
        return descreption;
    }

    public void setDescreption(String descreption) {
        this.descreption = descreption;
    }

    public String getImage() {
        return image;
    }

    public void setImage(String image) {
        this.image = image;
    }

    public String getCategory() {
        return category;
    }

    public void setCategory(String category) {
        this.category = category;
    }
}
