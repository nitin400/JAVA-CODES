class ICC {
    ICC() {
        System.out.println("in ICC constructor");
    }
}

class BCCI extends ICC {
    BCCI() {
        System.out.println("In BCCI CONSTRUCTOR");
    }
}

class client {
    public static void main(String[] args) {
        BCCI obj = new BCCI();
    }
}