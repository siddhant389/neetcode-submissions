class DynamicArray {

    private int[] dynamicArray;
    private int capacity;
    private int lastValueIndex;

    public DynamicArray(int capacity) {
        this.capacity = capacity;
        this.lastValueIndex = 0;
        this.dynamicArray = new int[capacity];
    }

    public int get(int i) {
        return this.dynamicArray[i];
    }

    public void set(int i, int n) {
        this.dynamicArray[i] = n;
    }

    public void pushback(int n) {
        if(this.lastValueIndex == this.capacity) this.resize();

        this.dynamicArray[this.lastValueIndex] = n;
        this.lastValueIndex++;
    }

    public int popback() {

        if(this.lastValueIndex > 0) this.lastValueIndex--;

        return this.dynamicArray[this.lastValueIndex];
    }

    private void resize() {
        capacity = capacity * 2;
        int[] newDynamicArray = new int[capacity];

        for(int i=0; i < this.lastValueIndex; i++) {
            newDynamicArray[i] = dynamicArray[i];
        }
        this.dynamicArray = newDynamicArray;
    }

    public int getSize() {
        return this.lastValueIndex;
    }

    public int getCapacity() {
        return this.capacity;
    }
}
