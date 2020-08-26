#include<bits/stdc++.h>
using namespace std;

// make like this a func and pass isvalid(r-1,c,arr)
//makes easy for any func with multple calls
//like even for maizepath2

bool isValid(int r, int c, vector<vector<int>>& v){

if(r<0 || r>=v.size() || c <0 || c >= v[0].size() || v[r][c] == 1 || v[r][c]==2){
    return false;
}
     return true;
}

void floodfill(vector<vector<int>>& v, int sr, int sc, string& psf)
{
 if (sr == v.size()-1 && sc == v[0].size()-1)
    {
        cout << psf << endl;
        return;
    }
 
// here at the end of the func we 
//just unmark each element as 0 again
// at the last line 

    v[sr][sc]=2;
    
    //0 for correct spot
    //1 for obstacle
    //2 for visited before itself

    if (sr - 1 >= 0 && v[sr - 1][sc] != 1 && v[sr-1][sc] != 2)
    {
        // cout<<"preD"<<endl;
        
        psf+='t';
        floodfill(v, sr - 1, sc, psf);
        psf.erase(psf.length()-1,1);
        
        // cout<<"postD"<<endl;
      
    } 
    if (sc - 1 >= 0 && v[sr][sc - 1] != 1 && v[sr][sc-1] != 2)
    {
        // cout<<"preD"<<endl;
        psf+='l';
        floodfill(v, sr, sc - 1, psf);
        psf.erase(psf.length()-1,1);
        // cout<<"postD"<<endl;
        
    } 

   if (sr + 1 < v.size() && v[sr + 1][sc] != 1 && v[sr+1][sc] != 2)   
     
     {
        psf+='d';
        floodfill(v, sr + 1, sc, psf );
        psf.erase(psf.length()-1,1);
        
    }

    if (sc + 1 < v[0].size() && v[sr][sc + 1] != 1 && v[sr][sc+1] != 2)
    {
        psf+='r';
        floodfill(v, sr, sc + 1, psf );
        psf.erase(psf.length()-1,1);
        
    }

v[sr][sc]=0;

// we just unmark here

}

int main(int argc, char** argv){

vector<vector<int>> v =
        {{0, 1, 0, 0, 0, 0, 0, 1},
         {0, 1, 0, 1, 1, 1, 0, 1},
         {0, 1, 0, 1, 0, 0, 0, 1},
         {0, 0, 0, 0, 0, 1, 1, 1},
         {0, 1, 0, 1, 0, 0, 0, 0},
         {0, 1, 0, 1, 1, 1, 1, 0}, 
         {0, 1, 0, 1, 1, 1, 1, 0},
         {0, 1, 0, 0, 0, 0, 0, 0}};
         
         string str="";

        floodfill(v, 0, 0, str);

    for(int i=0; i<v.size(); i++){
        for (int j=0; j< v[0].size(); j++){
            cout<<v[i][j]<<" ";
        }
        cout<<endl;
    }

        return 0;
}