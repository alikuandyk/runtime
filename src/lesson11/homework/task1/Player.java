package lesson11.homework.task1;

public class Player {
    // Указываем тип данных Weapon, который будет храниться в "слотах игрока"
    private Weapon[] weaponSlots;

    public Player() {
        // Снаряжаем нашего игрока
        weaponSlots = new Weapon[] {
                // TODO заполнить слоты оружием
                // new BigGun(),
                // new WaterPistol()
                new BigGun(),
                new WaterPistol()
        };
    }

    public int getSlotsCount() {
        // length - позволяет узнать, сколько всего слотов с оружием у игрока
        return weaponSlots.length;
    }

    public void shotWithWeapon(int slot) {
        // TODO если значение slot больше значения последнего элемента массива, то
        // выйти из метода написав об этом в консоль

        // Получаем оружие из выбранного слота

        if (slot > weaponSlots.length) {
            System.out.println("Ошибка: Некорректный слот. Выход из метода.");
            return;
        }

        Weapon weapon = weaponSlots[slot - 1];
        // Огонь!
        weapon.shot();
    }
}
