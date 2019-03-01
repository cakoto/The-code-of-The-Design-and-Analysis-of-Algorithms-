const long long N = xxx;//xxx 可替换
int vis[N];
int prime[N];
void Eratosthenes(long long n)
{
	memset(vis,0,sizeof(vis));
	long long m = sqrt(n + 0.5);
	for(int i = 2;i <= m;i++)
	{
		if(vis[i] != 0)
		{
			for(int j = i * i;j <= n;j+=i)
			{
				vis[j] = 1;
			}
		}
	}
	for(int i = 0;i <= n;i++)
	{
		int cnt = 0;
		if(vis[i] == 0) prime[cnt++] = vis[i];
	}
}

//复杂度：O（n*logn*logn)
