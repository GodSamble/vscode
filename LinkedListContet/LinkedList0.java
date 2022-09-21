        //########1
        class Data{
            String name;
            int point;
            Data next;
            int max=0;
            public Data(String n, int p){
                this.name = n;this.point = p;
                next = null;
            }
            
            public Data(){
                //Data(null, 0);
                this(null,0);
            }
    }