package com.fghilmany.movieapp.core.data.source.local.room;

import androidx.room.DatabaseConfiguration;
import androidx.room.InvalidationTracker;
import androidx.room.RoomOpenHelper;
import androidx.room.RoomOpenHelper.Delegate;
import androidx.room.RoomOpenHelper.ValidationResult;
import androidx.room.util.DBUtil;
import androidx.room.util.TableInfo;
import androidx.room.util.TableInfo.Column;
import androidx.room.util.TableInfo.ForeignKey;
import androidx.room.util.TableInfo.Index;
import androidx.sqlite.db.SupportSQLiteDatabase;
import androidx.sqlite.db.SupportSQLiteOpenHelper;
import androidx.sqlite.db.SupportSQLiteOpenHelper.Callback;
import androidx.sqlite.db.SupportSQLiteOpenHelper.Configuration;
import java.lang.Override;
import java.lang.String;
import java.lang.SuppressWarnings;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Set;

@SuppressWarnings({"unchecked", "deprecation"})
public final class MovieTvDatabase_Impl extends MovieTvDatabase {
  private volatile MovieTvDao _movieTvDao;

  @Override
  protected SupportSQLiteOpenHelper createOpenHelper(DatabaseConfiguration configuration) {
    final SupportSQLiteOpenHelper.Callback _openCallback = new RoomOpenHelper(configuration, new RoomOpenHelper.Delegate(1) {
      @Override
      public void createAllTables(SupportSQLiteDatabase _db) {
        _db.execSQL("CREATE TABLE IF NOT EXISTS `movieentities` (`id` INTEGER NOT NULL, `posterPath` TEXT NOT NULL, `title` TEXT NOT NULL, `voteAverage` REAL NOT NULL, `release_date` TEXT NOT NULL, `backdrop_path` TEXT NOT NULL, `overview` TEXT NOT NULL, `status` TEXT NOT NULL, `favorite` INTEGER NOT NULL, PRIMARY KEY(`id`))");
        _db.execSQL("CREATE TABLE IF NOT EXISTS `tventities` (`id` INTEGER NOT NULL, `name` TEXT NOT NULL, `posterPath` TEXT NOT NULL, `voteAverage` REAL NOT NULL, `first_air_date` TEXT NOT NULL, `backdropPath` TEXT NOT NULL, `overview` TEXT NOT NULL, `status` TEXT NOT NULL, `number_of_seasons` TEXT NOT NULL, `favorite` INTEGER NOT NULL, PRIMARY KEY(`id`))");
        _db.execSQL("CREATE TABLE IF NOT EXISTS room_master_table (id INTEGER PRIMARY KEY,identity_hash TEXT)");
        _db.execSQL("INSERT OR REPLACE INTO room_master_table (id,identity_hash) VALUES(42, '4559c3454379c358278c4bc19dc2d1fe')");
      }

      @Override
      public void dropAllTables(SupportSQLiteDatabase _db) {
        _db.execSQL("DROP TABLE IF EXISTS `movieentities`");
        _db.execSQL("DROP TABLE IF EXISTS `tventities`");
        if (mCallbacks != null) {
          for (int _i = 0, _size = mCallbacks.size(); _i < _size; _i++) {
            mCallbacks.get(_i).onDestructiveMigration(_db);
          }
        }
      }

      @Override
      protected void onCreate(SupportSQLiteDatabase _db) {
        if (mCallbacks != null) {
          for (int _i = 0, _size = mCallbacks.size(); _i < _size; _i++) {
            mCallbacks.get(_i).onCreate(_db);
          }
        }
      }

      @Override
      public void onOpen(SupportSQLiteDatabase _db) {
        mDatabase = _db;
        internalInitInvalidationTracker(_db);
        if (mCallbacks != null) {
          for (int _i = 0, _size = mCallbacks.size(); _i < _size; _i++) {
            mCallbacks.get(_i).onOpen(_db);
          }
        }
      }

      @Override
      public void onPreMigrate(SupportSQLiteDatabase _db) {
        DBUtil.dropFtsSyncTriggers(_db);
      }

      @Override
      public void onPostMigrate(SupportSQLiteDatabase _db) {
      }

      @Override
      protected RoomOpenHelper.ValidationResult onValidateSchema(SupportSQLiteDatabase _db) {
        final HashMap<String, TableInfo.Column> _columnsMovieentities = new HashMap<String, TableInfo.Column>(9);
        _columnsMovieentities.put("id", new TableInfo.Column("id", "INTEGER", true, 1, null, TableInfo.CREATED_FROM_ENTITY));
        _columnsMovieentities.put("posterPath", new TableInfo.Column("posterPath", "TEXT", true, 0, null, TableInfo.CREATED_FROM_ENTITY));
        _columnsMovieentities.put("title", new TableInfo.Column("title", "TEXT", true, 0, null, TableInfo.CREATED_FROM_ENTITY));
        _columnsMovieentities.put("voteAverage", new TableInfo.Column("voteAverage", "REAL", true, 0, null, TableInfo.CREATED_FROM_ENTITY));
        _columnsMovieentities.put("release_date", new TableInfo.Column("release_date", "TEXT", true, 0, null, TableInfo.CREATED_FROM_ENTITY));
        _columnsMovieentities.put("backdrop_path", new TableInfo.Column("backdrop_path", "TEXT", true, 0, null, TableInfo.CREATED_FROM_ENTITY));
        _columnsMovieentities.put("overview", new TableInfo.Column("overview", "TEXT", true, 0, null, TableInfo.CREATED_FROM_ENTITY));
        _columnsMovieentities.put("status", new TableInfo.Column("status", "TEXT", true, 0, null, TableInfo.CREATED_FROM_ENTITY));
        _columnsMovieentities.put("favorite", new TableInfo.Column("favorite", "INTEGER", true, 0, null, TableInfo.CREATED_FROM_ENTITY));
        final HashSet<TableInfo.ForeignKey> _foreignKeysMovieentities = new HashSet<TableInfo.ForeignKey>(0);
        final HashSet<TableInfo.Index> _indicesMovieentities = new HashSet<TableInfo.Index>(0);
        final TableInfo _infoMovieentities = new TableInfo("movieentities", _columnsMovieentities, _foreignKeysMovieentities, _indicesMovieentities);
        final TableInfo _existingMovieentities = TableInfo.read(_db, "movieentities");
        if (! _infoMovieentities.equals(_existingMovieentities)) {
          return new RoomOpenHelper.ValidationResult(false, "movieentities(com.fghilmany.movieapp.core.data.source.local.entity.MovieEntity).\n"
                  + " Expected:\n" + _infoMovieentities + "\n"
                  + " Found:\n" + _existingMovieentities);
        }
        final HashMap<String, TableInfo.Column> _columnsTventities = new HashMap<String, TableInfo.Column>(10);
        _columnsTventities.put("id", new TableInfo.Column("id", "INTEGER", true, 1, null, TableInfo.CREATED_FROM_ENTITY));
        _columnsTventities.put("name", new TableInfo.Column("name", "TEXT", true, 0, null, TableInfo.CREATED_FROM_ENTITY));
        _columnsTventities.put("posterPath", new TableInfo.Column("posterPath", "TEXT", true, 0, null, TableInfo.CREATED_FROM_ENTITY));
        _columnsTventities.put("voteAverage", new TableInfo.Column("voteAverage", "REAL", true, 0, null, TableInfo.CREATED_FROM_ENTITY));
        _columnsTventities.put("first_air_date", new TableInfo.Column("first_air_date", "TEXT", true, 0, null, TableInfo.CREATED_FROM_ENTITY));
        _columnsTventities.put("backdropPath", new TableInfo.Column("backdropPath", "TEXT", true, 0, null, TableInfo.CREATED_FROM_ENTITY));
        _columnsTventities.put("overview", new TableInfo.Column("overview", "TEXT", true, 0, null, TableInfo.CREATED_FROM_ENTITY));
        _columnsTventities.put("status", new TableInfo.Column("status", "TEXT", true, 0, null, TableInfo.CREATED_FROM_ENTITY));
        _columnsTventities.put("number_of_seasons", new TableInfo.Column("number_of_seasons", "TEXT", true, 0, null, TableInfo.CREATED_FROM_ENTITY));
        _columnsTventities.put("favorite", new TableInfo.Column("favorite", "INTEGER", true, 0, null, TableInfo.CREATED_FROM_ENTITY));
        final HashSet<TableInfo.ForeignKey> _foreignKeysTventities = new HashSet<TableInfo.ForeignKey>(0);
        final HashSet<TableInfo.Index> _indicesTventities = new HashSet<TableInfo.Index>(0);
        final TableInfo _infoTventities = new TableInfo("tventities", _columnsTventities, _foreignKeysTventities, _indicesTventities);
        final TableInfo _existingTventities = TableInfo.read(_db, "tventities");
        if (! _infoTventities.equals(_existingTventities)) {
          return new RoomOpenHelper.ValidationResult(false, "tventities(com.fghilmany.movieapp.core.data.source.local.entity.TvSeriesEntity).\n"
                  + " Expected:\n" + _infoTventities + "\n"
                  + " Found:\n" + _existingTventities);
        }
        return new RoomOpenHelper.ValidationResult(true, null);
      }
    }, "4559c3454379c358278c4bc19dc2d1fe", "291dd756065f332b8384c2fd35abb0f3");
    final SupportSQLiteOpenHelper.Configuration _sqliteConfig = SupportSQLiteOpenHelper.Configuration.builder(configuration.context)
        .name(configuration.name)
        .callback(_openCallback)
        .build();
    final SupportSQLiteOpenHelper _helper = configuration.sqliteOpenHelperFactory.create(_sqliteConfig);
    return _helper;
  }

  @Override
  protected InvalidationTracker createInvalidationTracker() {
    final HashMap<String, String> _shadowTablesMap = new HashMap<String, String>(0);
    HashMap<String, Set<String>> _viewTables = new HashMap<String, Set<String>>(0);
    return new InvalidationTracker(this, _shadowTablesMap, _viewTables, "movieentities","tventities");
  }

  @Override
  public void clearAllTables() {
    super.assertNotMainThread();
    final SupportSQLiteDatabase _db = super.getOpenHelper().getWritableDatabase();
    try {
      super.beginTransaction();
      _db.execSQL("DELETE FROM `movieentities`");
      _db.execSQL("DELETE FROM `tventities`");
      super.setTransactionSuccessful();
    } finally {
      super.endTransaction();
      _db.query("PRAGMA wal_checkpoint(FULL)").close();
      if (!_db.inTransaction()) {
        _db.execSQL("VACUUM");
      }
    }
  }

  @Override
  public MovieTvDao movieTvDao() {
    if (_movieTvDao != null) {
      return _movieTvDao;
    } else {
      synchronized(this) {
        if(_movieTvDao == null) {
          _movieTvDao = new MovieTvDao_Impl(this);
        }
        return _movieTvDao;
      }
    }
  }
}
