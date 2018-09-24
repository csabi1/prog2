#include <iostream>
using namespace std;

class Mother {
    public: void ir(){cout<<"Function of the mother!";}
};

class ancesster : public Mother {
    public: void masikir(){
        cout<<"Function of the ancesster";
    }
};
int main()
{
 Mother b;
 b.ir();
// b.masikir();

ancesster c;
c.ir();
}
