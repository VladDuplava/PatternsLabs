package structural;

import structural.adapter.*;
import structural.bridge.*;
import structural.composite.*;
import structural.decorator.*;
import structural.facade.*;
import structural.flyweight.*;
import structural.proxy.*;
import java.util.*; // Для List у Composite


// Adapter — це структурний патерн проектування, що дає змогу об’єктам із несумісними інтерфейсами працювати разом.
// трансформує інтерфейс або дані одного об’єкта таким чином, щоб він став зрозумілим іншому об’єкту.

//Bridge — це структурний патерн проектування, який розділяє один або кілька класів на дві окремі ієрархії
// абстракцію та реалізацію, дозволяючи змінювати код в одній гілці класів, незалежно від іншої.

//Composite - структурний патерн проектування, що дає змогу згрупувати декілька об’єктів у деревоподібну структуру,
// а потім працювати з нею так, ніби це одиничний об’єкт.

//Decorator - це структурний патерн проектування, що дає змогу динамічно додавати об’єктам нову функціональність,
// загортаючи їх у корисні «обгортки».

//Facade - це структурний патерн проектування, який надає простий інтерфейс до складної системи класів, бібліотеки або фреймворку.

//Flyweight - це структурний патерн проектування, що дає змогу вмістити більшу кількість об’єктів у відведеній оперативній пам’яті.
// Flyweight заощаджує пам’ять, розподіляючи спільний стан об’єктів між собою, замість зберігання однакових даних у кожному об’єкті.

//Proxy - це обгортка поверх методу який використовуєш щоб додати якийсь додатковий функціонал
// не викликаєш напряму а через цю обгортку і там додаткова логіка

public class Main {
    public static void main(String[] args) {
        System.out.println("--- 1. Adapter ---");
        TypeC adapter = new LightningToTypeCAdapter(new OldIPhone());
        adapter.connectWithTypeC();

        System.out.println("\n--- 2. Bridge ---");
        Laptop myMac = new MacBookPro(new MacOS());
        ((MacBookPro) myMac).showDetails();

        System.out.println("\n--- 3. Composite ---");
        Box bigBox = new Box();
        bigBox.addItem(new Device("iPhone 15"));
        bigBox.addItem(new Device("AirPods"));
        bigBox.showPrice();

        System.out.println("\n--- 4. Decorator ---");
        LaptopConfig upgradedMac = new RamUpgrade(new BaseMacBook());
        System.out.println(upgradedMac.getDescription() + " Price: $" + upgradedMac.getPrice());

        System.out.println("\n--- 5. Facade ---");
        new WorkFacade().startWorkDay();

        System.out.println("\n--- 6. Flyweight ---");
        IconFactory.getIcon("Safari").draw(10, 10);
        IconFactory.getIcon("Safari").draw(20, 10); // Використає той самий об'єкт

        System.out.println("\n--- 7. Proxy ---");
        CloudFile file = new ProxyCloudFile("backup.zip");
        file.download(); // Тільки тут відбудеться реальне завантаження
    }
}